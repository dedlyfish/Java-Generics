
// ��������� ����������� ���� V ����� T - ����������� ������������� ����� �����
public class StrictedGenCompatible<T, V extends T>{
	T ob1;
	V ob2;
	
	StrictedGenCompatible(T obj1, V obj2){
		ob1 = obj1;
		ob2 = obj2;
	}
}