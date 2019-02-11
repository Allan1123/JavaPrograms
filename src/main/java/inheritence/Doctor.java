package inheritence;

public class Doctor {
	
	public String fees;

	public  void Doctor_Details(String fees) {
		this.fees = "Bad Doctor";
	
	}
	
	public void DoctorGetter() {
		System.out.println("Allan");
	}
	
	public static void main(String[] args) {
		Doctor dc =  new Doctor();
		dc.DoctorGetter();
		
	}

}
