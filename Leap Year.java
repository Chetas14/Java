import java.util.Scanner;
class Main 
{
    static public void main(String[] chetas)
    {
        Scanner sc = new Scanner(System.in);
        int year;
        year=sc.nextInt();//Taking year as input from the user
        if(year%4==0 && year%100!=0)//Checks if the year is divisible by 4 and also the year is not a century year
        {
            System.out.println(year+" is a Leap year!");
        }
        else if(year%400==0)//checks if the year is completely divisible by 400
        {
            System.out.println(year+" is a Leap year!");
        }
        else{
            System.out.println(year+" is not a leap year!");
        }
        
    }
}