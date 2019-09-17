
interface Containment<T>{
	boolean contains(T obj);
}

public class GenInterface<T> implements Containment<T>{
	T[] arr;
	
	GenInterface(T[] obj){
		arr = obj;
	}

	public boolean contains(T obj) {
		for (T x : arr)
			if (x.equals(obj))
				return true;
		return false;
	}
}
