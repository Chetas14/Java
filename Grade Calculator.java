import java.util.Scanner;
class Main {
    static public void main(String[] chetas){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks Obtained By The Student: ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade Obtained By The Student: A");
        }
        else if(marks>=75 && marks<=90){
            System.out.println("Grade Obtained By The Student: B");
        }
        else if(marks>=60 && marks<=75){
            System.out.println("Grade Obtained By The Student: C");
        }
        else if(marks>=40 && marks<=60)
        System.out.println("Grade Obtained By The Student: D");
        else{
            System.out.println("Grade Obtained By The Student: Fail");
        }
        
    }
}