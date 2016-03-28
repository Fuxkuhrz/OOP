
import java.util.Scanner;
public class mainClass {
	//Add()
	public static double Add(double x, double y){
		double add = x + y;
		return add;
	}
	
	//Minus
	public static double Minus(double x, double y){
		double minus = x - y;
		return minus;
	}
	
	//Mul
	public static double Mul(double x, double y){
		double mul = x * y;
		return mul;
	}
	
	//Div
	public static double Div(double x, double y){
		double div = x / y;
		return div;
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		
		int mainCheck = 1;
		
		while(mainCheck == 1){
			int choice;
			double xx=0;
			double yy=0;
			double result=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("OPERATE SIMPLE PROGRAME");
		System.out.println("========================\n");
		System.out.println("PLEASE SELEC YOUR CHOICE.....\n");
		System.out.println("1.Add");
		System.out.println("2.Minus");
		System.out.println("3.Mul");
		System.out.println("4.Div\n");
		
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
		
		
		switch(choice){
			case 1 : {
				System.out.println("========================");
				System.out.print("\nADD Function : ");
				System.out.print("Enter your x : ");
				xx = sc.nextDouble();
				System.out.print("Enter your y : ");
				yy = sc.nextDouble();
				result = Add(xx,yy);
				result = Math.floor(result * 100) / 100;
				System.out.print("Result is : " + result);
				System.out.print("\nIf you want to Main Menu , Enter 1: ");
				System.out.print("\nIf you want to Exit , Enter 2: ");
				System.out.print(" Enter : ");
				mainCheck = sc.nextInt();
				
				break;
				
			} 
			
			case 2 : {
				System.out.println("========================");
				System.out.print("\nMinus Function : ");
				System.out.print("Enter your x : ");
				xx = sc.nextDouble();
				System.out.print("Enter your y : ");
				yy = sc.nextDouble();
				result = Minus(xx,yy);
				result = Math.floor(result * 100) / 100;
				System.out.print("Result is : " + result);
				System.out.print("\nIf you want to Main Menu , Enter 1: ");
				System.out.print("\nIf you want to Exit , Enter 2: ");
				System.out.print(" Enter : ");
				mainCheck = sc.nextInt();
				
				break;
			}
				
			case 3 : {
				System.out.println("========================");
				System.out.print("\nMul Function : ");
				System.out.print("Enter your x : ");
				xx = sc.nextDouble();
				System.out.print("Enter your y : ");
				yy = sc.nextDouble();
				result = Mul(xx,yy);
				result = Math.floor(result * 100) / 100;
				System.out.print("\nIf you want to Main Menu , Enter 1: ");
				System.out.print("\nIf you want to Exit , Enter 2: ");
				System.out.print(" Enter : ");
				mainCheck = sc.nextInt();
				break;
				
			} 
			
			case 4 : {
				System.out.println("========================");
				System.out.print("\nDiv Function : ");
				System.out.print("Enter your x : ");
				xx = sc.nextDouble();
				System.out.print("Enter your y : ");
				yy = sc.nextDouble();
				result = Div(xx,yy);
				result = Math.floor(result * 100) / 100;
				System.out.print("Result is : " + result);
				System.out.print("\nIf you want to Main Menu , Enter 1: ");
				System.out.print("\nIf you want to Exit , Enter 2: ");
				System.out.print(" Enter : ");
				mainCheck = sc.nextInt();
				break;
				
			}
			
			default : System.out.println("No..Choice");
				break;
			
			
		
		
		}
		
	

	
		

	}

	}
}
