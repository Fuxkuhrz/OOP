class  ex_overloadstatic{
	public static void main(String[] args){
		print("RMUTSV"+2+1+(5+5));
		print("RMUTSV");
		print(2+2);
		print(1/2f);
		print("HACKER", 50);
		print(50,"CRACKER");
	}
	//-------------------------------------------------
	public static void print(String arg){
		System.out.println(arg);
	}
	//------------------------------------------------
	public static void print(int arg){
		System.out.println(arg);
	}
   //-----------------------------------------------
   public static void print(double arg){
		System.out.println(arg);
	}
	//---------------------------------------------
	public static void print(String arg_str, int arg_int){
		System.out.println(arg_str+ " " + arg_int);
	}
	//----------------------------------------------
	public static void print(int arg_int, String arg_str){
		System.out.println(arg_int+ " " + arg_str);
	}

}
