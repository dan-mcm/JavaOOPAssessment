package a2_09556362;

public class Person {
	private Name name;
	private Address address;
	
	// Construct a Person object with the specified name and address
	public Person(Name name, Address address){
		this.name = name;
		this.address = address;
	}
	
	// Name getter method
	public Name getName(){
		return this.name;
		
	}
	
	// Return a string representation
	@Override
	public String toString() {
		return "name: " + name + "\n" + address + "\n";
	}
	
}
