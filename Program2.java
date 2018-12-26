import java.util.Scanner;

public class Program2 {
//checks to make sure order of numbers is in strictly increasing or decreasing order
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x<y && y<z) {
			System.out.print("true");
		}
		else if (x>y && y>z) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
		sc.close();
	}

}
