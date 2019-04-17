import java.util.Scanner;

public class Main extends Employee{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Employee John = new Employee();
		John.fname = "John";
		John.lname = "Jones";
		John.salary = 100000;
		John.id = 42;
		System.out.println(John.toString());
		System.out.println("What percent raise do you want? ");
		int pRaise = in.nextInt();
		John.raise(pRaise);
		System.out.println(John.toString());
	}
}