package a2_09556362;

class Student extends Person {
	private static final int MAX_NUMBER_MODULES = 12;
	private String programme;
	private int counter = 0;
	//array of type module...
	private Module[] modules = new Module[MAX_NUMBER_MODULES];
	
	//constructor to create student with specified name address and programme
	public Student(Name name, Address address, String programme) {
		super(name,address);
		this.programme = programme;
	}
	
	//addModule method - also returns boolean value depending on whether update is possible
	public boolean addModule(Module m){
		if(counter >= MAX_NUMBER_MODULES){
			return false;
		} else {
			modules[counter] = m;
			counter++;
			return true;
		}
	}
	
	// Return a string representation
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//use string builder here to add account for multiple modules being added - unknown how many at a glance...
		
		sb.append(super.toString() + "programme: " + programme + "\n");
		sb.append("modules:\n");
		
		//if the very first element in the modules array is null then there are no modules and we append none
		if (modules[0] == null){
			sb.append("\t none \n");
		} else {
			//iterating through all the modules and adding their code and title to the string that is returned.
			for(Module m: modules){
				if(m != null)
				sb.append("\t" + m.getCode() + " (" + m.getTitle() + ")" + "\n");
			}
		}
		return sb.toString();
	}	
}
