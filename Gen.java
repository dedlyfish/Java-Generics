
public class Gen<T> {
	T ob;
	Gen(T obj){
		ob = obj;
	}
	
	T getob() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type T is: " + ob.getClass().getName());
	}
}
