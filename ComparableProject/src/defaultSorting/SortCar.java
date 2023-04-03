package defaultSorting;
import java.util.TreeSet;

public class SortCar {
	public static void main(String[] args) {
		Car c1=new Car(200000);
		Car c2=new Car(300000);
		Car c3=new Car(400000);
		
		TreeSet<Car> t1=new TreeSet<Car>();
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);
		
		for(Car c:t1)
		{
			System.out.println(c);
		}
		
		
		
	}

}
