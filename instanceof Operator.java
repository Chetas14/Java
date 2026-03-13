//instanceof operator: It is used for type checking.It can be used to check if an object is an instance of the class,subclass,interface.
public class Main 
{
    static public void main(String[] chetas)
    {
        String str="Chetas";
        System.out.println(str instanceof String);
        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}