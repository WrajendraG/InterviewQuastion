package number;
import reusablecode.*;
import java.util.Scanner;
public class ExecutionLogic {

	public static void main(String[] args) {
	Sum s=new Sum();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter two Number = ");
	int a= scanner.nextInt();
	int b = scanner.nextInt();
    int result= s.sum(a,b);
    System.out.println("Sum is ="+result);

	scanner.close();

	}

}
