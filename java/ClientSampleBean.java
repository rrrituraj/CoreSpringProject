import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientSampleBean {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("samplebeanconfig1.xml");
		
		/**
		 * use this classpath resource
		 * Resource rs = new ClassPathResource("samplebeanconfig.xml");
		 * for the different address of same inner bean
		 * the problem associated with the inner bean, now resolved
		 * 
		 */
		
		
		BeanFactory factory = new XmlBeanFactory(rs);
		Object o2 = factory.getBean("id3");
		DemoBean db=(DemoBean)o2;
		System.out.println("inner bean address\t"+db);
		Object o = factory.getBean("id1");
		SampleBean sb = (SampleBean) o;
		sb.show();
		Object o1 = factory.getBean("id2");
		ExampleBean eb = (ExampleBean) o1;
		eb.show1();
		

	}

}
