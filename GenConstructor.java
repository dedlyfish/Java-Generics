
public class GenConstructor {
	private int sum;
	
	<T extends Number> GenConstructor(T obj){
		sum = 0;
		for (int i=0; i<=obj.intValue(); i++)
			sum += i;
	}
	
	int getSum() {
		return sum;
	}
}
