package projectjsp;

import org.springframework.stereotype.Component;

import projectjsp.interfaces.Car;
@Component("corola")
public class Corola implements Car {

	@Override
	public void specs() {
		System.out.println("Hatchback from suzuki");

	}

}
