
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import projectjsp.Corolla;
import projectjsp.Swift;
import projectjsp.specs.EngineType;


@Configuration
@ComponentScan("projectjsp")
public class Appconfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("UnknownEngine")
	public EngineType type() {
		return new EngineType();
	}
	
	@Bean("V6Engine")
	public EngineType v6type() {
		return new EngineType("V6 Engine");
	}
	

}