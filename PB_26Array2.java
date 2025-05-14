import java.util.Scanner;
public class PB_26Array2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        //int m=sc.nextInt();
        int [][] flats= new int[n][m];

        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                flats[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display the matrix: ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(flats[i][j]+" ");
            }
            System.out.print("\n");
        }

        int [][] flats2= new int[n][m];

        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                flats2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display the matrix: ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(flats2[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("The sum of the matrix: ");
        int [][] sum= new int[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = flats[i][j] + flats2[i][j];
               
            }
        }
        System.out.println("Final sum of the matrix: ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }


    }
}
