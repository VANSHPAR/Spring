package projectjsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import projectjsp.interfaces.Car;
@Component("corolla")
public class Corolla implements Car {
    
	@Autowired   
	//or @Autowired(required=false)
	Engine engine;
	
	
	public Corolla(Engine engine) {
		engine.type="V55";
		this.engine = engine;
	}
    
	

	@Override
	public void specs() {
		System.out.println("Hatchback from suzuki with engine as "+engine.type);

	}


	public void setEngine(Engine engine) {  //to run setter we use autowired keyword here instead of declare on object
		engine.type="v18";
		this.engine = engine;
	}

}