import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("low:");
        int low=sc.nextInt();
        System.out.println("high:");
        int high=sc.nextInt();
        int sum=0;
        for(int i=low;i<=high;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}