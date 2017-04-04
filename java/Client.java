
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String[] abs) {
		Resource rs = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		Object o = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean) o;
		wb.show();

	}
}
