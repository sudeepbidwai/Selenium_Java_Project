package practise2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("abc");
		al.add("a");
		al.add("aa");
		al.add("12");
		
		
		System.out.println(al.size());
		System.out.println(al.contains("1"));
		al.remove("2");
		System.out.println(al);
		System.out.println(al.isEmpty());
		//al.clear();
		//System.out.println(al.isEmpty());
		
		al.add(1, "3");
		System.out.println(al);
		
	}

}
