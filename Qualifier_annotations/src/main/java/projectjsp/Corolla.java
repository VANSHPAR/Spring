package projectjsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import projectjsp.interfaces.Car;
import projectjsp.interfaces.Engine;
@Component("corolla")
public class Corolla implements Car {
    
	@Autowired   
	@Qualifier("V8Engine")
	Engine engine;
	
	
	
	

	@Override
	public void specs() {
		System.out.println("Hatchback from suzuki with engine as "+engine.specs());

	}


	

}