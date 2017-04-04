import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestConstructorBean {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("constructorbeanconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object O=factory.getBean("id1");
		ConstructorBean cb=(ConstructorBean)O;
		cb.show();

	}

}
