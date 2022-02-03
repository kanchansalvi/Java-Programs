public class KeyWords {

    public static class Table {
       enum Type  {
            KITCHEN,
            DINING;
        };
    };

    public enum Season { WINTER, SPRING, SUMMER, FALL } 
    
    public static void main(String args[]){  
        System.out.println("Hello Java");  
        int age = 6;
        // if(age<18) {
        //     throw new ArithmeticException("Person is not eligible to vote");
        // }

        //continue
        //Loop restarts from the continue
        for(int i=0; i<8; i++){

            if(i%2==0)continue;

            System.out.print(" : "+i);
        }

        int arr[] = new int[5];
        // for
        for(int i1=0; i1<arr.length; i1++){
            arr[i1] = i1*2;
        }
        // what is extended for loop?
        for(int i1 : arr){
            System.out.print(" : "+i1);
        }


        // new - for creating instance

        // enum- 
        // when to use it
        // sample enum

    for (Season s : Season.values()){  
        System.out.println(s);  
    }  
    System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
    System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  // place of enum starts at 0


        // switch
        // write switch for int/char/string values
        // extra - write switch with enums
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Yes");
                break;
            case 2:
                System.out.println("No");  //Outputs "No"
                break;
            default:        
                System.out.println("Undecided");
         }



        



    }
}

/*
abstract	continue	for	        new	        switch
assert***	default	    goto*	    package	    synchronized
boolean	    do	        if	        private	    this
break	    double	    implements	protected	throw
byte	    else	    import	    public	    throws
case	    enum****	instanceof	return	    transient
catch	    extends	    int	        short	    try
char	    final	    interface	static	    void
class	    finally	    long	    strictfp**	volatile
const*	    float	    native	    super	    while

*/

/* - Ganesh changed
abstract(later)	continue	for	        new	        switch
assert***	default	    goto*	    package	    synchronized
boolean	    do	        if	        private	    this
break	    double	    implements	protected	throw
byte	    else	    import	    public	    throws
case	    enum****	instanceof	return	    transient
catch	    extends	    int	        short	    try
char	    final	    interface	static	    void
class	    finally	    long	    strictfp**	volatile
const*	    float	    native	    super	    while

*/