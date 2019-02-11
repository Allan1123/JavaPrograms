package week6day3;

public class StaticProgram {
	
	static String a="Hello";
	static String b="World";
	
	public static void method1() {
		System.out.println(a+" "+b);
		
	}
	
	public void method2() {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		method1();
	StaticProgram sp= new StaticProgram();
	sp.method2();	
	}
}
