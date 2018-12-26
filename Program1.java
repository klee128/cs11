import java.util.Scanner;

public class Program1 {
//converts f t0 c or k to c
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		double output_variable = sc.nextDouble();
		
		
		if (c.equals("t")) {
			output_variable = (output_variable - 32)*5/9;
			
			System.out.printf("%.2f", output_variable);
		}
		
		
		else if (c.equals("k")) {
			output_variable = (output_variable - 273.15);
			System.out.printf("%.2f", output_variable);
		}
		
	}

}
