package week10day1;

import java.util.ArrayList;

public class ArrayListGenerics{
	int empId;
	String name;


	public ArrayListGenerics(int empId,String name) {
		
		this.empId=empId;
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		ArrayListGenerics arr= new ArrayListGenerics(100,"Princy");
		ArrayListGenerics arr1= new ArrayListGenerics(300,"Allan");
		
		ArrayList<ArrayListGenerics> list= new ArrayList<ArrayListGenerics>();
		list.add(arr1);
		list.add(arr);
		
		for (int j = 0; j <list.size(); j++) {
			
			System.out.println(list.get(j).empId+"\t"+list.get(j).name);
		}
		
	}

}
