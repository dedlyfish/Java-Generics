
public class Generics {

	static void GenDemo() {
		System.out.println("1. ����� ������� �������� Gen");
		Gen<Integer> iOb = new Gen<Integer>(88);
		iOb.showType();
		System.out.println("Value is: " + iOb.getob());
		Gen<String> sOb = new Gen<String>("Custom String");
		sOb.showType();
		System.out.println("Value is: " + sOb.getob());
	}
	
	static void TwoGenDemo() {
		System.out.println("2. �������� � ����� ������ TwoGen");
		TwoGen<Integer, String> obj = new TwoGen<Integer, String>(10, "Ten");
		obj.showType();
		System.out.println("Value 1: " + obj.getob1());
		System.out.println("Value 2: " + obj.getob2());
	}
	
	static void StrictedGenDemo() {
		System.out.println("3. �������� � ������, ������������� ������������ �� ����������� (Number)");
		StrictedGen<Integer> obj = new StrictedGen<Integer>(10);
		
		// ������ ����������, �.�. ����� ��������� ������, ������������ �� Number
		//StrictedGen<String> = new StrictedGen<String>("String");
		
		StrictedGenCompatible<Integer, Integer> bounded_obj = new StrictedGenCompatible<Integer, Integer>(10, 10);
	}
	
	static void GenArgumentDemo() {
		System.out.println("4. ���������� �������� � �������� ������, ������������ ��� ��������� ������ ����� ������");
		GenArgument<Float> obj1 = new GenArgument<Float>((float) 1);
		GenArgument<Integer> obj2 = new GenArgument<Integer>((int) 1);
		System.out.println(obj1.absEqual(obj2));
	}
	
	public static void main(String[] args) {
		//GenDemo();
		//TwoGenDemo();
		//StrictedGenDemo();
		GenArgumentDemo();
	}

}
