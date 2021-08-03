
public class Cric implements Comparable {
	int runs;
	public Cric(int runs)
	{
		super();
		this.runs=runs;
		
	}
	public int getRuns()
	{
		return runs;
		
	}
	public int compareTo(Object y)
	{
		if(this.runs<((Cric)(y)).runs)
		{
			return -1;
		}
		else if(this.runs>((Cric)(y)).runs)
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
		return runs+" "+" Hello";
	}

}
