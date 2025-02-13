package projectjsp.specs;
import org.springframework.stereotype.Component;

import projectjsp.interfaces.Engine;


@Component("V8Engine")
public class V8 implements Engine {
	@Override
	public String specs() {
		return "V8 Engine";
	}

}
