import java.util.Scanner;
//
//------------------------------------------------------------
public class methodTestGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		String[] subject= {"Thai", "Math", "Art", "Programming", "Network"};
		int i,j=0,k=1,m;
		System.out.println("SIMPLE GRADE FINDER");
		System.out.println("Please input your score each of subject...");
		System.out.println("Press any key to continue. . .");
		sc.nextLine();

		
		for(i=0;i<score.length;i++){
			System.out.print(k + ". Subject " + subject[j] + " > ");
			score[i] = sc.nextInt();
			k++;
			j++;
		}
		
		System.out.println("\n\n");
		
		j=0;
		k=1;
		for(m=0;m<score.length;m++){
			System.out.print(k + ". Subject " + subject[j] + " > ");
			Grade(score[m]);
			j++;
			k++;
			
			
			
		}
		
		

		
		
		
		
		System.out.println("\n\n");
	}
	
//------------------------------------------------------------
	public static void Grade(int grade){
		if(grade < 50 ){
			System.out.println("You grade is F");
		}
		else if(grade >= 50 && grade <= 60){
			System.out.println("You grade is D");
		}
		else if(grade >= 61 && grade <= 70){
			System.out.println("You grade is C");
		}
		else if(grade >= 71 && grade <= 80){
			System.out.println("You grade is B");
		}
		else {
			System.out.println("You grade is A");
		}
			
		
		
	}

				
//------------------------------------------------------------
}
