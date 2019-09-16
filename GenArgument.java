

public class GenArgument<T extends Number> {
	T ob;
	
	GenArgument(T obj){
		ob = obj;
	}

	boolean absEqual(GenArgument<?> arg) {
		if (Math.abs(ob.doubleValue()) == Math.abs(arg.ob.doubleValue()))
				return true;
		return false;
	}
}
