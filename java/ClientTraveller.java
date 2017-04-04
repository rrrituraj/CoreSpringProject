import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientTraveller {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("vehicleconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res); //parent container
		
		Resource res1=new ClassPathResource("traveller.xml");
		BeanFactory factory1=new XmlBeanFactory(res1, factory); //child container
		
		Object O=factory1.getBean("id3");
		Journey i=(Journey)O;
		i.startJourney();
		

	}

}
