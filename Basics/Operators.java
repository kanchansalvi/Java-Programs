public class Operators {
    public static void main(String args[]){  

        int i=0;
        int m1=i++;    // m1=0 i=1 : Post-increment --> first i is assigned to m1 and then incremented
        int m2=++i;   //  m2=2 i=2 : Pre-increment  --> i is incremented first and then assigned to m2

        System.out.println("m1="+m1+"; m2="+m2);   

        System.out.println("Post Increment");
        for(i=0; i<3; i++){
            m1=i;
            System.out.println("i="+i+" m1="+m1);
        }
        System.out.println("After post increment the values are : i="+i+" m1="+m1);

        System.out.println("Pre Increment");
        for(i=0; i<3; ++i){
            m1=i;
            System.out.println("i="+i+" m1="+m1);
        }
        System.out.println("After pre increment the values are : i="+i+" m1="+m1);



    //Unary Operators
    int x=10;  
    System.out.println(x++);//10 (11)  
    System.out.println(++x);//12  
    System.out.println(x--);//12 (11)  
    System.out.println(--x);//10  
    int a=10;  
    int b=-10;  
    System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
    System.out.println(~b);//9 (positive of total minus, positive starts from 0) 
    
    //Left Shift Operator
    System.out.println(10<<2);//10*2^2=10*4=40  
    System.out.println(10<<3);//10*2^3=10*8=80  
    System.out.println(20<<2);//20*2^2=20*4=80  
    System.out.println(15<<4);//15*2^4=15*16=240  

    //Right Shift Operator
    System.out.println(10>>2);//10/2^2=10/4=2  
    System.out.println(20>>2);//20/2^2=20/4=5  
    System.out.println(20>>3);//20/2^3=20/8=2 

    //Shift Operator Example: >> vs >>>
     //For positive number, >> and >>> works same  
     System.out.println(20>>2);  
     System.out.println(20>>>2);  
     //For negative number, >>> changes parity bit (MSB) to 0  
     System.out.println(-20>>2);  
     System.out.println(-20>>>2);  

     //Logical && and Bitwise &
     int c=20;  
    System.out.println(a<b&&a<c);//false && true = false  
    System.out.println(a<b&a<c);//false & true = false  

    //Logical || and Bitwise |
    System.out.println(a>b||a<c);//true || true = true  
    System.out.println(a>b|a<c);//true | true = true  
    //|| vs |  
    System.out.println(a>b||a++<c);//true || true = true  
    System.out.println(a);//10 because second condition is not checked  
    System.out.println(a>b|a++<c);//true | true = true  
    System.out.println(a);//11 because second condition is checked  

    //Ternary Operator

    int min=(a<b)?a:b;  
    System.out.println(min);  


       }  
}
