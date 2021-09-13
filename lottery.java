import java.util.*;

class lottery{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int res=r.nextInt(89)+10;
        System.out.println("lottery number is generated");
        System.out.println("enter your no");
        int x;
        x=sc.nextInt();
        if(x==res)
        {
            System.out.println("exact order-10000");
        }
        else if(res/10==x%10&&res%10==x/10)
        {
            System.out.println("not in exact order -3000");
        }
        else if(res/10==x/10||res/10==x%10||res%10==x%10||res%10==x/10)
        {
            System.out.println("only one number-1000");
        }
        else{
            System.out.println("sorrry zeroooo ");
        }
        
        System.out.println("lottery number is  "+res);
    }
}