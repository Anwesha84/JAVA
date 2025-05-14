import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        System.out.println("Enter the total no. of subjects: ");
        Scanner sc=new Scanner(System.in);
        int Total=sc.nextInt();
        int n, i;
        int sum=0;
        for (i = 0; i <Total; i++) {
            System.out.println("Enter subject name: ");
            String str=sc.next();
            System.out.println("Enter the marks: ");
            int marks = sc.nextInt();
            sum=sum+marks;
        }
        System.out.println(sum);
        System.out.println("The percentage of the marks: ");
        float perc;
        perc = (sum/Total);
        System.out.println(perc+"%");
    }
}