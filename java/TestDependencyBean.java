import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestDependencyBean {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("dependencybeanconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object O=factory.getBean("id1");
		DependencyBean db=(DependencyBean)O;
		System.out.println(db.getA());
		System.out.println(db.getB()); //print 0 as default value	
		System.out.println(db.getDb());
	}

}
