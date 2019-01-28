package library;

import java.util.ArrayList;
import java.util.Locale;

import gaixinh.Girl;

public class L01 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	String a = "Linh Cam";
	list.add(a);
	String b = "Khải";
	list.add(0,b);
	String c= "Hà Giang";
	list.add(1,c);
	list.remove(1);
	list.remove("Linh Cam");
	list.add("Hà chó");
	list.add("Quỳnh búp bê");
	System.out.println(list.get(0));
	System.out.println(list.indexOf("Quỳnh búp bê"));
	System.out.println(list.size());
	int array[] = new int[10];
	try {
		System.out.println(array[11]);
	} catch (Exception e) {
	}
	
	
	System.out.println("Linh cute");
}
}
