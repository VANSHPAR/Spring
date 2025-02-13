package projectjsp;

import org.springframework.stereotype.Component;

import projectjsp.interfaces.Car;
@Component("swift")
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Sedan from Toyota");

	}

}
