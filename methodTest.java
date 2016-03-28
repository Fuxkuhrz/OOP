import java.util.Scanner;
//
//------------------------------------------------------------
public class methodTest {

	public static void main(String[] args) {
		int chioce,x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("SIMPLE CALCULATOR PROGRAM");
		System.out.println("Please select your choice...\n");
		System.out.println("1.Addition");
		System.out.println("2.Minus");
		System.out.println("3.Multiply");
		System.out.println("4.Divided\n");
		System.out.print("> ");
		chioce = sc.nextInt();
		
		switch(chioce){
		
		case 1 : {
					System.out.println("Addition Program");
					System.out.print("Enter x value : ");
					x = sc.nextInt();
					System.out.print("Enter y value : ");
					y = sc.nextInt();
					Addition(x,y);
				}break;
		case 2 : {
					System.out.println("Minus Program");
					System.out.print("Enter x value : ");
					x = sc.nextInt();
					System.out.print("Enter y value : ");
					y = sc.nextInt();
					Minus(x,y);
			
				}break;
		case 3 : {
					System.out.println("Multiply Program");
					System.out.print("Enter x value : ");
					x = sc.nextInt();
					System.out.print("Enter y value : ");
					y = sc.nextInt();
					Multiply(x,y);
			
				}break;
		case 4 : {
					System.out.println("Multiply Program");
					System.out.print("Enter x value : ");
					x = sc.nextInt();
					System.out.print("Enter y value : ");
					y = sc.nextInt();
					Divided(x,y);
			
				}break;
		default : {
					System.out.println("Unknow choice...");
			
				}break;
		
		}
		
		

	}
//------------------------------------------------------------
	
	public static void Addition(int x, int y){
		int result_add = x + y;
		
		System.out.println("Result is : " + result_add);
	}
	
//------------------------------------------------------------

//------------------------------------------------------------
	
	public static void Minus(int x, int y){
		int result_minus = x - y;
			
		System.out.println("Result is : " + result_minus);
	}
		
//------------------------------------------------------------
	
//------------------------------------------------------------
	
	public static void Multiply(int x, int y){
		int result_mul = x * y;
				
		System.out.println("Result is : " + result_mul);
	}
			
//------------------------------------------------------------

//------------------------------------------------------------
	
	public static void Divided(int x, int y){
		int result_div = x / y;
					
		System.out.println("Result is : " + result_div);
	}
				
//------------------------------------------------------------
}
