public class PB_30method {
     int mysum(int a,int b)      // we are not using static so we have to make object.
    {
        int c;
        if(a>b)
        {
           c=a+b;
        }
        else
            c=(a+b)/5;
        return c;
    }

    public static void main(String[] args) {
        int a=45;
        int b=50;
        PB_30method obj= new PB_30method();  //creating a obj.

                int z;
        z = obj.mysum(a,b);
        System.out.println(z);
    }
}
