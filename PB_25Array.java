import java.util.Scanner;
public class PB_25Array {
    public static void main(String[] args) {
        //Cretaing a Array

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array is: ");
        int n=sc.nextInt();
        int [] marks=new int [n];
        System.out.println("Array elements are: ");
        int i;
        for(i=0;i<marks.length;i++)
        {
             marks [i] =sc.nextInt();
        }
        System.out.println("Display the Array(Forward printing for loop): ");
        for(i=0;i<marks.length;i++)
        {
            System.out.println(marks [i]);
        }
        System.out.println("Display the Array(reverse printing for loop): ");
        for(i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks [i]);
        }
        System.out.println("Display the Array(For each_loop): ");
        for(int elements:marks)
        {
            System.out.println(elements);
        }

    }
}
