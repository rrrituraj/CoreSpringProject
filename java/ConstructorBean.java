public class ConstructorBean {
	private String message;
	public ConstructorBean(String message) {
		this.message=message;
	}
	public void show(){
		System.out.println(message);	
	}
}
