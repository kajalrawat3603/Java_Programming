package unit01;
import java.util.Scanner;
public class P7_Task_01_SwitchCasesInJava {

	public static void main(String[] args) {
		int year;
		String month,day;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter current Year");
		year=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter current month");
		month=scan.nextLine();
		System.out.println("Enter current day");
		day=scan.nextLine();
        	System.out.println("enter 1 for current year \nenter 2 for current month\n3 for current day");
        	int ch=scan.nextInt();
        	switch(ch) {
        	case 1:System.out.println("Current year is:");
        	       System.out.println(year);
        	       break;
            case 2:System.out.println("Current month is:");
 	               System.out.println(month);
 	               break; 
            case 3:System.out.println("Current day is:");
 	               System.out.println(day);
 	               break;
            default:
            	   System.out.println("WRONG CHOICE!");
        	}
	}
}
