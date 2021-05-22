package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class listex {

	public static void main(String args[]) {
		System.out.println("--------기본 문형 1--------");
		List mylist = new ArrayList(); //ArrayList mylist = new ArrayList(); // List mylist = new LinkedList();
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		System.out.println(mylist.get(0));
		mylist.remove(0);
		System.out.println(mylist.get(0));
		
		Iterator it = mylist.iterator(); // 실무유형1
		while(it.hasNext()){ 
		    int value = (int) it.next();
		    System.out.println(value);                 
		}
		for(Object i : mylist) {   // 실무유형2   
			System.out.println(i);
		}
		
		for(int i=0; i < mylist.size(); i++) { 
			System.out.println(mylist.get(i));
		}
		
		System.out.println("--------기본 문형 2--------");
		List<Integer> mylist2 = new ArrayList<Integer>(); //ArrayList mylist = new ArrayList(); // List mylist = new LinkedList();
		mylist2.add(1);
		mylist2.add(2);
		mylist2.add(3);
		System.out.println(mylist2.get(0));
		mylist2.remove(0);
		System.out.println(mylist2.get(0));
		
		Iterator<Integer> it2 = mylist2.iterator(); //print all elements
		while(it2.hasNext()){
		    int value = (int) it2.next();
		    System.out.println(value);                 
		}
		
		for(Integer i : mylist2) {       //print all elements
			System.out.println(i);
		}
		
		for(int i=0; i < mylist2.size(); i++) { //print all elements
			System.out.println(mylist2.get(i));
		}
		
		System.out.println("--------------------------------");
		
		ArrayList list = new ArrayList();
		list.add(1);
		System.out.println(list.get(0));
		
	}
}
