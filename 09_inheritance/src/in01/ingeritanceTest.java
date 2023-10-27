package in01;

class A {
	int aa = 1;
}
class B extends A {
	int bb = 2;
}
class C extends B {
	int cc = 3;
}




public class ingeritanceTest {

	public static void main(String[] args) {
		C objC = new C();
		System.out .println("c클래스 객체에서 속성 값: " + objC.aa);
		System.out.println("C클래스 객체에서 속성 값: " + objC.bb);
		System.out .println("C클래스 객체에서 속성 값: " + objC.cc);

		B objB = new B();
		System.out .println("B클래스 객체에서 속성 값: " + objB.aa);
		System.out.println("B클래스 객체에서 속성 값: " + objB.bb);
		
		
		A objA = new A();
		System.out .println("A클래스 객체에서 속성 값: " + objA.aa);
		
}
}
