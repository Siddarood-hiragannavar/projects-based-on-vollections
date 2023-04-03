package defaultSorting;

public class Car implements Comparable<Car>  {
	int cost;

	public Car(int cost) {
		
		this.cost = cost;
	}
	@Override
	public String toString()
	{
		return "cost is :"+cost;
		
	}
	public int compareTo(Car c)
	{
		return (int) (c.cost-this.cost);
	}
	

}
