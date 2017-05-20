package a2_09556362;

public class Instructor extends Person {
	
	private String position;
	private Module module;
	
	// Construct an Instructor object with the specified name, address and position 
	public Instructor(Name name, Address address, String position) {
		super(name, address); //default syntax to including super class name and address
		this.position = position;
	}
	
	// Moduler setter
	public void setModule(Module toSet){
		this.module = toSet;
	}
	
	// Return a string representation
	@Override
	public String toString() {
		//workaround to account for if module.getCode is null...
		if(module!=null){
		return super.toString() + "position: " + position +  "\n" + "module: " + module.getCode() + " " + "(" + module.getTitle() + ")" + "\n"; 
		} else {
		return super.toString() + "position: " + position +  "\n" + "module: not set \n"; 
		}

	}
	
}
