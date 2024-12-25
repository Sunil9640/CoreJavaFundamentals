package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {

	int roll;
	String name;

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + "]";
	}

	public Students() {
		super();

		System.out.println(" this is default constuctor ");
	}

	public Students(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int compareTo(Students that) {

		if (this.roll > that.roll)
			return 1;
		else
			return -1;

	}

}

public class SortingCompare {

	public static void main(String args[]) {

////
//		Comparator<Students> com = new Comparator<Students>() {
//
//			@Override
//			public int compare(Students o1, Students o2) {
//
//				if (o1.roll > o2.roll)
//					return 1;
//				else
//					return -1;
//			}
//		};

		// same method can be written as lambda expression and turniority method

		Comparator<Students> com = (Students o1, Students o2) -> o1.roll > o2.roll ? 1 : -1;

		ArrayList<Students> stud = new ArrayList<Students>();

		stud.add(new Students(20, " sunil")); 
		stud.add(new Students(15, " varun"));
		stud.add(new Students(30, " naveen"));
		stud.add(new Students(80, " pranay"));
		stud.add(new Students());

		Collections.sort(stud, com);

		for (Students s : stud) {
			System.out.println(s);
		}
	}

}
