import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("customerconfig.xml");
		Object O=ctx.getBean("CustomerBean");
		Customer c=(Customer)O;
		System.out.println(c.getPerson().getName());
		System.out.println(c.getType());

	}

}
