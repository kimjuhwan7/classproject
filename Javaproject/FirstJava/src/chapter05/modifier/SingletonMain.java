package chapter05.modifier;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s = null;
		// s = new Singleton();
		s = Singleton.getInstance();
	}// 이해안됨 어려움 흐름파악 못함
}
