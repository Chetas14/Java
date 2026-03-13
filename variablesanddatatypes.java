//DataTypes in java is used to specify what kind of value can be stored in a particular variable
//Variables are the containers used to store some values in a program,their values keeps on changing during the entire execution of the program
class DataTypes //Class Declaration
{
    static public void main(String []args) //Main Method
    {
        //Primitive DataTypes: Fundamental DataTypes which are independent
         //Variable declaration Syntax:datatype variable_name;
          int a; //Here int is a Datatype and a is a variable which can contain integer values,size=4 bytes i.e 32bits Default value of int is 0
          a=14;//Assigning a value to the variable
          byte b =1; //Declaration And Initialization in the same line here byte is a Datatype and b is a variable, size=1 byte i.e 8 bits Default value of byte is 0
          short c = 3; //Here short is a Datatype and c is a variable ,size=2 bytes i.e 16 bits Default value=0;
          long d=4; //Here long is a Datatype and d is a variable, size=8 bytes i.e 64 bits Default value=0;
          float e=3.14;//Here float is a Datatype and e is a variable, size=4 bytes i.e 32bits Default value=0.0f it is used to store decimal values upto precision of 6-7digits
          double f=24.33557899900; //Here double is a Datatype and f is a variable,size=8 bytes i.e 64 bits Default Values=0.0d it is used to store decimal values upto precision of 15-16 digits
          boolean g=false; // Here boolean is a datatype it is used to store either true or false size =1 bit(approx) default value is false
          char h = 'a';//Here h char is a Datatype and h is a variable used to store a single Character size=2 bytes i.e 16 bits default value='\u0000'
          //Non-primitive types:  also called reference types, are created by the programmer and store the memory addresses (references) to objects rather than the actual data value.
          String i ="chetas"; //array of characters enclosed within double quotes and strings are immutable
          System.out.println(a);//Used to display the output
          System.out.println(b);
          System.out.println(c);
          System.out.println(d);
          System.out.println(e);
          System.out.println(f);
          System.out.println(g);
          System.out.println(h);
          System.out.println(i);
          
          
    }
}