import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDff {
  public static void main(String[] argv) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int year_, month_, day_;
	  int d,m,y;
	  
	  DateDff obj = new DateDff();
	  
	  
	  
	  
	  
	  System.out.println("Enter your Birth Date at Below fill . . .\n(A.D only this code is not support B.E eiei . . ^^)");
	  System.out.print("Date : ");
	  d = sc.nextInt();
	  System.out.print("Month : ");
	  m = sc.nextInt();
	  System.out.print("Year : ");
	  y = sc.nextInt();
	  
	  
	  
	  
	  
	  
	  year_ = (obj.BirthFinder(d,m,y)[0]);
	  month_ = (obj.BirthFinder(d,m,y)[1]);
	  day_ = (obj.BirthFinder(d,m,y)[2]);
  
	  System.out.println("Your age is : " + year_ + " years, " + month_ + " mounts, " + day_ + " days . . .");
	  
	 
	  
	 
	  
	}
  
  //----------------------------------------------------
  public int[] BirthFinder(int day, int month,  int year){
	  
	  Date Birthdate = new GregorianCalendar(year, month, day, 23, 59).getTime();
	  Date Today = new Date();
	  
	  long diff = Today.getTime() - Birthdate.getTime();
	  
	  long Totalday = diff / (1000 * 60 * 60 * 24)+32;
	  
	  
	  
	  int year_ans = (int)(Totalday/365);
	  int month_ans = (int)(Totalday%365)/30;
	  int day_ans = (int)((Totalday%365)%30)/2;
	  return new int[]{year_ans, month_ans, day_ans};
	  
	  }
}
