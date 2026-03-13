import java.util.Scanner;
class Main 
{
    static public void main(String[] chetas)
    {
        Scanner sc =  new Scanner(System.in);
        int number;
        number=sc.nextInt();
        double double_remainder=number/2.0;
        int integer_remainder=(int)double_remainder;
        if(double_remainder==integer_remainder){
            System.out.println("The number entered by the user is even!");
        }
        else{
            System.out.println("The number entered by the user is odd!");
        }
    }
}