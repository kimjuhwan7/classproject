
package chapter11;

public class MyInterFaceImpl<T1, T2> implements MyInterFace<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		// TODO Auto-generated method stub
		return t;
	}

	public static void main(String[] args) {
		MyInterFaceImpl<String, Integer> myClass = new MyInterFaceImpl<String, Integer>();
		System.out.println(myClass.method1("Ten"));
		System.out.println(myClass.method2(10 ));
	}
}
