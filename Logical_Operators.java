//Logical Operators:Used to Perform logical operations and returns a boolean value as an output
//Logical And(&&):Returns true when all the values are true else false
//Logical Or(||):returns true if any one of the value is true else false
//Logical Not(!):returns true when input is false and returns false when input is true;
class Main
{
    static public void main(String[] args)
    {
        boolean a=true;
        boolean b=false;
        System.out.println("a && b: "+(a&&b));
        System.out.println("a || b: "+(a||b));
        System.out.println("!a: "+(!a));
        
    }
}