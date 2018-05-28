import java.util.*;
import java.util.ArrayList;
class Student implements Comparable<Student>{

	int age;
	int id;
	String name;
	public Student(int id, String name, int age){

		this.age = age;
		this.name = name;
		this.id = id;

	}


//Sorting based on age and then id
	public int compareTo(Student st){
		if(this.age == st.age) 
		{
			if(this.id<st.id) return -1;
			if(this.id==st.id) return 0;
			else return 1;
		}
		
		if(this.age<st.age) return -1;
		return 1;
	}

	public String toString(){
		return "[id="+this.id+",name="+this.name+",age="+this.age+"]";
	}

}
class ComparableExample{

	public static void main(String args[]){
		ArrayList<Student> al = new ArrayList<Student>();
		//Sort based on age 
		al.add(new Student(1, "B", 15));
		al.add(new Student(3, "A", 14)); 
		al.add(new Student(2, "C", 13));

		System.out.println("Before sort"+al);
		Collections.sort(al);
		System.out.println("Sorted list"+al);
		al.add(new Student(4,"F",14));
		Collections.sort(al);
		System.out.println("Sorted based on age and id:"+al);

	}
}