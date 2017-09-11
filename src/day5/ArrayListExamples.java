package day5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<>();
		mylist.add("selenium");
		mylist.add("Jmeter");
		mylist.add("codedui");
		System.out.println(mylist.size());
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
	}
}


