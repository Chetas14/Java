//User input using Scanner class
import java.util.Scanner; //Definition For Scanner class is present in java.util hence we need to import it
class Main {
    static public void main(String []chetas)
    {
        Scanner sc = new Scanner(System.in);//Object creation  of Scanner class to access the methods of the scanner class
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        String s1,s2;
        boolean h;
        char i;
        //In the Below lines we are using scanner class object to call different methods of scanner class to take input of different datatypes
        a=sc.nextByte();
        b=sc.nextShort();
        c=sc.nextInt();
        d=sc.nextLong();
        e=sc.nextFloat();
        f=sc.nextDouble();
        s1=sc.next();//Takes only 1 word as input
        s2=sc.nextLine();//Takes n number of words as input
        h=sc.nextBoolean();
        i=sc.next().charAt(0);
    }
}