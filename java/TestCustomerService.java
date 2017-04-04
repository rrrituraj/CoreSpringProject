import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerService {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerService cust = (CustomerService) context.getBean("customerService");

		System.out.println(cust);

		((ConfigurableApplicationContext) context).close();

	}

}
