package inheritence;

class PrivateConstructor {

	private PrivateConstructor() {

	}
	private void m() {

		System.out.println("This is private");	
	}

	public static void main(String[] args) {
		PrivateConstructor pc= new PrivateConstructor();
		pc.m();
	}
}
