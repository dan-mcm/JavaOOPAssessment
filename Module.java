package a2_09556362;

public class Module {
	private static final int MAX_NUMBER_STUDENTS = 80;
	private int counter = 0;
	private String code;
	private String title;
	private Instructor instructor;
	//array of type student...
	private Student[] students = new Student[MAX_NUMBER_STUDENTS];
	
	
	//construct a Module object with values code and title
	public Module(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	//module code getter method
	public String getCode(){
		return this.code;
	}
	
	//module title getter method
	public String getTitle(){
		return this.title;
	}
	
	//module instructor getter method
	public Instructor getInstructor(){
		return this.instructor;
	}
	
	//module instructor setter method
	public void setInstructor(Instructor instructor){
		this.instructor = instructor;
	}
	
	//module add student method - also returns boolean value if possible to add students
	public boolean addStudent(Student s){
		if(counter < MAX_NUMBER_STUDENTS){
			students[counter] = s;
			counter ++;
			return true;
		} else {
			return false;
		}
	}

	// Return a string representation
	@Override
	public String toString() {
		
		//using stringbuilder as unknown at a glance size of student + instructor arrays
		StringBuilder sb = new StringBuilder();
		
		sb.append("code: " + code + "\n");
		sb.append("title: " + title + "\n");
		
		//accounting for if instructor isn't assigned..
		if(instructor != null){
			sb.append("instructor: " + instructor.getName() + "\n");
		} else {
			sb.append("Instructor: not set" + "\n");
		}
		
		//iterating through student array - if no students in first position of the array then we add none to the string
		sb.append("students: " + "\n");
		if (students[0] == null){
			sb.append("\t none \n");
		} else {
			//iterating through all the modules and adding their code and title to the string that is returned.
			for(Student s: students){
				if(s != null)
				sb.append("\t" + s.getName() + "\n");
			}
		}
			
		return sb.toString();
	}
	
}