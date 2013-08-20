import java.util.Scanner;
import java.util.Random;

public class StringProblems {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double apr, may, jun;

		System.out.println("Rainfall for April");
		apr = reader.nextDouble();
		System.out.println("Rainfall for May");
		may = reader.nextDouble();
		System.out.println("Rainfall for June");
		jun = reader.nextDouble();

		System.out.println("Average rainfall: " + (apr+may+jun)/3.0);

	}
}