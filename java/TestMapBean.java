import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestMapBean {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("mapconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object O=factory.getBean("id1");
		MapBean mb=(MapBean)O;
		mb.printMap();
	}

}
