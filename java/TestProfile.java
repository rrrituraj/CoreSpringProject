import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProfile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationconfig.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();

	}
}
