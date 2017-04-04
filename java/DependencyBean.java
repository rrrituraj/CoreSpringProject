
public class DependencyBean {
	private int a, b;
	private DemoBean db;
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setDb(DemoBean db) {
		this.db = db;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public DemoBean getDb() {
		return db;
	}
	
}
