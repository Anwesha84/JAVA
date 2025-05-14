import java.util.Scanner;

public class PB05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input through keyboard");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}
