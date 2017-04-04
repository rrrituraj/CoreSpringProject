
public class ExampleBean3 {
	private ExampleBean2 eb2;
	public ExampleBean3(ExampleBean2 eb2) {
		this.eb2=eb2;
	}
	public void show(){
		System.out.println("ExampleBean3 show() method");
		eb2.m1();
	}

}
