package pe.edu.tecsup.collections.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort3 {
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		
		al.add(new Student("Jose"));
		al.add(new Student("Pedro"));
		al.add(new Student("Alberto"));
		al.add(new Student("Jaime"));
		al.add(new Student("Samir"));

		Collections.sort(al);
		//Collections.sort(al,Collections.reverseOrder());
		
		for (Student s : al) 
			System.out.println(s.name);
		
	}
}