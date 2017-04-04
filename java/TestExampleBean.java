import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestExampleBean {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("examplebeanconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object O=factory.getBean("id1");
		ExampleBean3 ex3=(ExampleBean3)O;
		ex3.show();
	}

}
