package projectjsp.specs;
import org.springframework.stereotype.Component;

import projectjsp.interfaces.Engine;
@Component("V6Engine")
public class V6 implements Engine{
	@Override
	public String specs() {
		
		return "V6 Engine";
	}
}
