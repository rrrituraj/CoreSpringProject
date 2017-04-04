import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBean {
	private Map<String, Integer> employee;
	public void setEmployee(Map<String, Integer> employee){
		this.employee=employee;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void printMap(){
		Set s=employee.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry<String, Integer> me=(Map.Entry<String, Integer>)itr.next();
			System.out.println(me.getKey()+"-------"+me.getValue());
		}
	}
	
}
