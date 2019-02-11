package inheritence;

public class Hospital extends Doctor {

	Hospital h= new Hospital();
	
	
	public void DoctorGetter() {
		super.DoctorGetter();
		//System.out.println("Allan has overriden");

	}

	public static void main(String[] args) {
		Hospital hp= new Hospital();
		hp.DoctorGetter();
	}

}
