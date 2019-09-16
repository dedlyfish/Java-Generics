
public class StrictedGen<T extends Number> {
	T num;
	StrictedGen(T number){
		num = number;
	}
	
	void showType() {
		System.out.println("T is " + num.getClass().getName());
	}
	
	T getob() {
		return num;
	}
}

