class ex_instanceMethod2 {
	public static void main(String[] args) {
		ex_instanceMethod2 obj = new ex_instanceMethod2();
		obj.print("RMUTSV");
		obj.print(999);
		obj.print(1/2f);
		obj.print(9+9);
		obj.print("TEST " + 2+" " + 10+" " +(1.55+2.99));

	}
	//-----------------------------------------------------
	public void print(String arg){
		System.out.println(arg);
	}
	//-----------------------------------------------------
	public void print(int arg){
		System.out.println(arg);
	}
	//----------------------------------------------------
	public void print(double arg){
		System.out.println(arg);
	}

}
