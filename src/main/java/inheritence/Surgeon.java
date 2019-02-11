package inheritence;

public class Surgeon  {
	private int knife=10;
	
	public Surgeon() {
		System.out.println(this.knife);
	}
	
	public Surgeon(int knife) {
		this.knife=knife;
	}
	
	public void display() {
		System.out.println(this.knife);
	}
	
	public static void main(String[] args) {
		Surgeon s= new Surgeon(200);
		s.display();
	}
	
	
	}

