class DataTypes{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  

//Integers
        byte b=100; //  byte
        short s = 1000;
        int i = -300; // signed int 
        long l = 100*100*100;

        System.out.println("byte="+b+" short="+s+" int="+i+" long="+l);

//Floating values
    double d = 3.14d;
    float f = 22/7;
    // float res = d*f; Type mismatch : res needs to be in double.
    double res = d*f;
    System.out.println("Res = " +res);

//Characters
char ch1 = 'a';
char ch2 = 88; //Code for 'X'
System.out.println("ch1 = " +ch1+" ch2="+ch2);

//Booleans
boolean bool = false;
if(!bool) System.out.println("bool= "+bool);

//Literals
int x=0b1010, y=12_34_89;
char octal_a='\141', hex_a='\u0061';
System.out.println("Value of x="+x+"; Y="+y+"; Octal Notation is="+octal_a+"; hexadecimal Notation="+hex_a);

//Bit Manipulation
//XOR Operation
int a=5, b1=8;
int c=a^b1, d1=a^a;
System.out.println("5^8="+c+"; 5^5="+d1);

//Type Casting and conversion
//byte->short->int->long reverse not allowed. result of different type opeartion is the highest type. 
//Eg if operation involves long and int, result is long
//Explicit Casting
byte b2=20;
b2 =(byte) (b2*2);

    }  
}  