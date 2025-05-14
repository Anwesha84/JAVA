//Creat an Array of five floats and calculate their sum
/*import java.util.Scanner;
public class PB_29practiceArray {
    public static void main(String[] args) {
        System.out.println("The size of the array is: ");
        Scanner sc= new Scanner(System.in);
        float n=sc.nextFloat();
        float [] flats= new float[n];
        for(float i=0.0;i<flats.length;i++)
        {
             flats[i]=sc.nextFloat();
        }
        for(float x:flats)
        {
            System.out.println(x);
        }


    }

}


 */
//A Given num is present in the array or not
import java.util.Scanner;
public class PB_29practiceArray {
    public static void main(String[] args) {
        //Cretaing a Array

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array is: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Array elements are: ");
        int i;
        for (i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Display the Array(Forward printing for loop): ");
        for (i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Enter a number to check wheather it is present or not");
        int num = sc.nextInt();
        boolean IsPresent = false;
        for (i = 0; i < marks.length; i++) {
            if (marks[i] == num)
                IsPresent = true;
        }
        if (IsPresent == true) {
            System.out.println("The num is present");

        }
        else
            System.out.println("The num is not present");
    }
}
