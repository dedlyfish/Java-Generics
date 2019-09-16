
public class TwoGen<T, V> {
	T ob1;
	V ob2;
	
	TwoGen(T obj1, V obj2){
		ob1 = obj1;
		ob2 = obj2;
	}
	
	void showType() {
		System.out.println("T is type: " + ob1.getClass().getName());
		System.out.println("V is type: " + ob2.getClass().getName());
	}
	
	T getob1() {
		return ob1;
	}
	
	V getob2() {
		return ob2;
	}
}
