package comparator;

public class Student implements Comparable<Student> {
	String name;
	int id;
	int age;
	public Student(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		
	}
	public int compareTo(Student o)
	{
		int id1=this.id;
		int id2=o.id;
		if(id1<id2)
		{
			return -1;
		}
		else if(id1>id2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	public String toString()
	{
		return name +" "+id +" "; 
	}
	
	
	

}
