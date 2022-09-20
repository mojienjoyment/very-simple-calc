package sumcalc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Please input number a:");
		int a = get.nextInt();
		System.out.println("Please input number b:");
		int b = get.nextInt();
		System.out.println("sum of a and b is = "+(a+b));
	}
}
