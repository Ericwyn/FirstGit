public class Main{
	public static void main(String [] args){
		B b=new B(134,12,"hello",1245532);
		System.out.println(B.name);
	}
}
class A {
	int height;
	int age;
	String name;
	public A(int height,int age,String name){
		this.height=height;
		this.age=age;
		this.name=name;
	}
}

class B extends A{
	int ID;
	public B(int height,int age,String name,int ID){
		super(height,age,name);
		this.ID=ID;
	}
}