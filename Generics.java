
public class Generics {

	static void GenDemo() {
		System.out.println("1. Самый простой дженерик Gen");
		Gen<Integer> iOb = new Gen<Integer>(88);
		iOb.showType();
		System.out.println("Value is: " + iOb.getob());
		Gen<String> sOb = new Gen<String>("Custom String");
		sOb.showType();
		System.out.println("Value is: " + sOb.getob());
	}
	
	static void TwoGenDemo() {
		System.out.println("2. Дженерик с двумя типами TwoGen");
		TwoGen<Integer, String> obj = new TwoGen<Integer, String>(10, "Ten");
		obj.showType();
		System.out.println("Value 1: " + obj.getob1());
		System.out.println("Value 2: " + obj.getob2());
	}
	
	static void StrictedGenDemo() {
		System.out.println("3. Дженерик с типами, ограниченными производными от суперкласса (Number)");
		StrictedGen<Integer> obj = new StrictedGen<Integer>(10);
		
		// ошибка компиляции, т.к. класс ограничен типами, производными от Number
		//StrictedGen<String> = new StrictedGen<String>("String");
		
		StrictedGenCompatible<Integer, Integer> bounded_obj = new StrictedGenCompatible<Integer, Integer>(10, 10);
	}
	
	static void GenArgumentDemo() {
		System.out.println("4. Обобщенный агрумент в дженерик классе, используется для сравнения разных типов данных");
		GenArgument<Float> obj1 = new GenArgument<Float>((float) 1);
		GenArgument<Integer> obj2 = new GenArgument<Integer>((int) 1);
		System.out.println(obj1.absEqual(obj2));
	}
	
	static void GenMethodDemo() {
		System.out.println("5. Обобщенный метод, используется для сравнения двух массивов");
		Integer n1[] = {1, 2, 3, 4, 5};
		Integer n2[] = {1, 2, 3, 4, 5};
		Integer n3[] = {0, 1, 2, 3};
		
		System.out.println(GenericMethod.arraysEqual(n1, n2));
		System.out.println(GenericMethod.arraysEqual(n1, n3));
	}
	
	static void GenConstructDemo() {
		System.out.println("5. Обобщенный конструктор");
		GenConstructor sum = new GenConstructor(4.0);
		System.out.println(sum.getSum());
	}
	
	static void GenIfaceDemo() {
		System.out.println("6. Обобщенный интерфейс");
		Integer n[] = {1, 2, 3, 4, 5};
		GenInterface<Integer> x = new GenInterface<Integer>(n);
		System.out.println(x.contains(3));
		System.out.println(x.contains(10));
	}
	
	public static void main(String[] args) {
		//GenDemo();
		//TwoGenDemo();
		//StrictedGenDemo();
		//GenArgumentDemo();
		//GenMethodDemo();
		//GenConstructDemo();
		GenIfaceDemo();
	}

}
