import java.util.Scanner;

public class Program3 {
	//how many times a number can be divided by 2

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int k = 1;
		
		if (n<=0) {
			System.out.println("Illegal Input");
		}
		else if (n > 0) {
			while (n > 1) {
				n=n/2;
				k++;
				
			}
			System.out.println(k);
		}
		sc.close();
	}

}
