package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestSort1 {
	public static void main(String args[]) {

		List<String> al = new ArrayList<String>();
		al.add("Jose");
		al.add("Zevallos");
		al.add("Pedro");
		al.add("Alberto");
		al.add("Samir");

		Collections.sort(al);
        //Collections.sort(al,Collections.reverseOrder());  

		for (String s : al) 
			System.out.println(s);
	}
}