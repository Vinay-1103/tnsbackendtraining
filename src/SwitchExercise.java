import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {

        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        choice=sc.nextInt();
        switch (choice){
            case 0: System.out.println("Sunday");
            break;
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
