import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		
//		if(x=="참") {
//			System.out.println("참입니다.");
//		}
		
		String grade = x > 90 ? "90초과입니다. " : x == 90 ? "90입니다. " : "90미만입니다.";
		
		
		
		
		
		System.out.println(grade);

	}
	}



