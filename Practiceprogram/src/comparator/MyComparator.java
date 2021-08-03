package comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2)
	{
		// TODO Auto-generated method stub
		Student s1=(Student)o1;
		int id1=s1.id;
		Student s2=(Student)o2;
		int id2=s2.id;
		//return id2.compareTo(id1);
		if(id1<id2)
		{
			return 1;
		}
		else if(id1>id2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
		
	}

}

