//Bitwise Operators: These operators perform operations on the binary form of the data
class Main
{
    static public void main(String[] args)
    {
        int a=5,b=10;
        System.out.println("a & b: "+(a&b));
        System.out.println("a | b: "+(a|b));
        System.out.println("a & b: "+(a^b));
        System.out.println("~a: "+(~a));
        System.out.println("a<<2: "+(a<<2));
        System.out.println("a>>1: "+(a>>1));
        System.out.println("a>>>1: "+(a>>>1));
    }
}