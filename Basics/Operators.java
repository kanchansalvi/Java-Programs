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

       }  
}
