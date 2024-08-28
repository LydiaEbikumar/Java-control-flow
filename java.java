import java.util.*;
public class java{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break; 
            default:
                break;
        }
        for(int i=1;i<=num;i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i=num;i>=1;i--){
            System.out.print(i);
        }
    }
}