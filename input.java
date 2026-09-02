/*1.Given two integers low and high, return the sum of all integers from low to high inclusive.

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
}*/

 //2.Complete the function printNumber which takes an integer input from the user and prints it on the screen.

 /*import java.util.Scanner;
 public class input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("num");
         System.out.println(number);
    }
 }*/

//3.Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.(for loop)
/*import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int sum=0;
        int number= d;
        for(int i=1;i<=50;i++){
            sum=sum+number;
            number=number+10;
            System.out.println(number);

        }

    }
}*/


//4.Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.(while loop)
/*import java.util.Scanner;
public class input{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int d=scan.nextInt();
        int sum=0;
        int number=d;
        int i=1;
        sum=sum+number;
        while(i<=50){

        number=number+10;
        System.out.println(number);

        i++;
        }

        System.out.println("sum="+ sum);
    }
}*/

//5.Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

/*import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1; i<=n; i++){

            for(int j=1;j<=i;j++){

            System.out.print("*");     
            }
        System.out.println();
                
    }

}
}*/

// 6.Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below: 1 12 123 1234

/*import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1; i<=n; i++){

            for(int j=1;j<=i;j++){

            System.out.print(j);     
            }
        System.out.println();
                
    }

}
}*/

/*if (condition) {
    // condition is true
} else {
    // condition is false
}*/

//7. write the program when it is upper or lower
/*import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(ch >='A' && ch <='Z'){
            System.out.print("uppercase");
         } else{
                System.out.print("lowercase");
            }

    }
}*/

/*8.import java.util.Scanner;
public class input{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int salary=scan.nextInt();
        if(salary>=100000){
            System.out.print("enjoy the life!");
        }else{
            System.out.print("accept the life what you have!");
        }
    }
}*/

// 9.Write a Java program that takes one character as input and checks whether it is a digit or not.

import java.util.Scanner;
public class input{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        char ch= scan.next().charAt(0);
        if(ch>='0' && ch<='9'){
            System.out.print("digit");
        }else{
            System.out.print("not digit");;
        }
    }
    
}





