import java.util.Scanner;

class number{
    int a;
    int b;
 number(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        int c=a+b;
        System.out.println(c);
    }
    public void substract(){
        if(b>a){
        int c=b-a;
        System.out.println(c);
        }
        else{
            int c=a-b;
            System.out.println(c); 
        }
    }
    public void multiply(){
        int c=a*b;
        System.out.println(c);
    }
    public void equal(){
        if(a==b)
        {
        System.out.println("equal");
        }   
        else{
            System.out.println("not equal");   
        }
    }
    public void lowestform(){
        int c=a;
        int d=b;
     while(a!=b)
     {
         if(a>b)
         {
             a=a-b;
         }
         else{
             b=b-a;
         }
         
     }
     int gcd=b;
     System.out.println(gcd);
         int k=(c/gcd);
         int l=(d/gcd);
         System.out.println(k+"/"+l);
    }


}
 class Rational {
   
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
        number num=new number(a,b);
     num.add();
     num.substract();
     num.multiply();
     num.equal();
     num.lowestform();
    
     sc.close();
    }
}
