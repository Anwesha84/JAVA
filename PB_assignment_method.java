public class PB_assignment_method {
    static int table(int n)
    {
        int result=0;
        for(int i=0;i<=10;i++)
        {
            result=n*i;
            System.out.format("%d x %d = %d\n",n,i,result);

        }
        return result;
    }
    static void pattern(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n)
    {
        int i,j;
        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        table(7);
        pattern(4);
        pattern2(4);
    }
}
