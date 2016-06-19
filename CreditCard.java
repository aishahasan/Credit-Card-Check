//**************************************
//CreditCard.java
//Aisha Hasan 
//This class is to determine if a 
//credit card number is valid.
//**************************************

public class CreditCard { 

    private String number;
    private boolean valid;
    private int errorCode=0;

//here I have initialized three variables that I will be 
//using throughout the class.       
 
    public CreditCard(String creditCardNumber){
	number=creditCardNumber;
	valid=true;
    }
   

    private void check1(){
//This method checks to make the first number is 4.
 
	int errorCode1;

//This errorCode was made to initialize the errorCode.
//This way if there is this is the first error
//it will get changed to 1.

	int first=Integer.parseInt(number.substring(0,1));
	if(!(first==4)){
	valid=false;
	errorCode1=1;
	errorCode=errorCode1;
    	}
    }

    private void check2(){
//This method makes sure that digit 4 is one more than 5.

	int x=Integer.parseInt(number.substring(3,4));
  	int y=Integer.parseInt(number.substring(4,5));
	if(!(x==(y+1))){
	valid=false;	
	    if(errorCode==0){
            errorCode=2;
//This checked to make sure that there were no errors yet
//hence it equaling zero from before. If it didnt == 0
//then this way would ensure that the number at the 
//end represents the first test failed. 
    	    }
	}
     }

    private void check3(){
//This method checks the products of digits 1,5,&9 to make sure
//equals to 24.

	int one=Integer.parseInt(number.substring(0,1));
	int fifth=Integer.parseInt(number.substring(4,5));
	int ninth=Integer.parseInt(number.substring(8,9));
	if(!((one*fifth*ninth)==24)){
	valid=false;
	    if(errorCode==0){
            errorCode=3;
            }
	}
    }
   
    private void check4(){
//This method makes sure the sum of all digits is divisible
//by 4.

	int line=Integer.parseInt(number.substring(0,4));
	int line2=Integer.parseInt(number.substring(4,8));
	int line3=Integer.parseInt(number.substring(8,12));
	
	int thou = line/1000; 
	int rem = line%1000;
	int hund = rem / 100 ;
        int remainder = rem % 100 ;
        int tens = remainder / 10 ;
        int units = remainder % 10 ;
	
	int thou2= line2/1000;
	int rem2 = line%1000;
	int hund2 = rem2 / 100 ;
        int remainder2 = rem2 % 100 ;
        int tens2 = remainder2 / 10 ;
        int units2 = remainder2 % 10 ;

	int thou3 = line3/1000;
	int rem3 = line%1000;
	int hund3 = rem3 / 100 ;
        int remainder3 = rem3 % 100 ;
        int tens3 = remainder3 / 10 ;
        int units3 = remainder3 % 10 ;
        
	int sum=thou+hund+tens+units+thou2+hund2+tens2+units2+thou3+hund3+tens3+units3;
	if(!((sum%4)==0)){
	valid=false;
	    if(errorCode==0){
            errorCode=4;
            }
	}
    }

    private void check5(){
//This method makes sure sum of digits 1-4 is one less than
//sum of digits from 9-12

	int line=Integer.parseInt(number.substring(0,4));
        int line2=Integer.parseInt(number.substring(8,12));
	
	int thou = line/1000;
	int rem = line%1000;
        int hund = rem / 100 ;
        int remainder = rem % 100 ;
        int tens = remainder / 10 ;
        int units = remainder % 10 ;
        
        int thou2= line2/1000;
	int rem2 = line2%1000;
        int hund2 = rem2 / 100 ;
        int remainder2 = rem2 % 100 ;
        int tens2 = remainder2 / 10 ;
        int units2 = remainder2 % 10 ;

	int sum = thou+hund+tens+units;
	int last = thou2+hund2+tens2+units2;

	if(!(sum==(last-1))){
        valid=false;
            if(errorCode==0){
            errorCode=5;
            }
	}
    }
   
    private void check6(){
//This method makes sure that the first two digits and the 
// digits 7&8 both as two digits numbers add up to 100.

	int line=Integer.parseInt(number.substring(0,2));
        int line2=Integer.parseInt(number.substring(6,8));
	int sum=line+line2;

	if(!(sum==100)){
        valid=false;
            if(errorCode==0){
            errorCode=6;
            }
        }
    }
	
    public void check(){
//This method combines all the check methods into one.
	check1();
	check2();
	check3();
	check4();
	check5();
	check6();
    }
    
    public boolean isValid(){
//This method checks the true/false of the class.
	return valid;
    }

    public int getErrorCode(){
//This method gets the error code and tells of the first
//check point that was failed.

	return errorCode;
    }

}
