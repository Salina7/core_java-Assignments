package Assignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class TestEmp implements Comparable<Employee>{


		private static Employee[] newList;

		public static void main(String []arg) {
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(111,"Shalu",50000));
		list.add(new Employee(111,"Shalu",50000));
		list.add(new Employee(111,"Shalu",50000));
		list.add(new Employee(112,"Sandy",25000));
		for(Employee emp:list) {
			System.out.println(emp.getempid());
		}
	Set<Employee>set=new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee e, Employee e1) {
				return e.getempid()==e1.getempid()?0:1;
			}
		});
		set.addAll(list);
		final ArrayList<Employee>newlist=new ArrayList<Employee>(set);
		System.out.println("after removing duplicates");
		for(Employee emp:newList) {
			System.out.println(emp.getempid());
		}
		
		}
		
}

		