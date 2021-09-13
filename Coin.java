import java.util.*;
public class Coin {
    public static void main(String args[]) {
        Random ran=new Random();
        int count1=0;
        int count2=0;
        for(int i=0;i<500000000;i++){
        int y=ran.nextInt();
        if(y==0)
        {
           count1++;
        }
        else{
            count2++;
        }
        
        }
        if(count1==count2){
            System.out.print("unbiased");
        }
        else{
            System.out.println("biased");  
        }
System.out.println(count1);
System.out.println(count2);
    }

}
