package projectjsp.specs;


import projectjsp.interfaces.Engine;

public class EngineType implements Engine{
	String type;
	public EngineType() {
		type="Unknown";
	}
	public EngineType(String type) {
		super();
		this.type = type;
	}
	

	


	@Override
	public String specs() {
		
		return type;
	}
}
