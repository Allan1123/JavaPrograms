package inheritence;

class StaticClass {
	int rollNo;
	static String schoolName="Beta";

	static void school() {
		System.out.println("Alpha");
	}
	

	
	StaticClass(int r){
		rollNo=r;
	}
	void display() {
		System.out.println(rollNo+"  "+schoolName);
	}

	public static void main(String[] args) {
		//StaticClass.school();
		
		StaticClass s1= new StaticClass(10);
		s1.display();


	}

}
