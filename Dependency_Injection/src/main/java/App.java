import projectjsp.interfaces.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
//		Car o1=new Swift();
//		o1.specs();
//		Car o2=new Swift();
//		o2.specs();
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Car mycar=context.getBean("ccc",Car.class);
		mycar.specs();
		context.close();
	}

}
