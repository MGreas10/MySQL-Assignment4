package sortingfile;

public class Student {
	
	private String name;
	
	public Student( String name) {
	
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  "name: " + name;
	}
	
	public static int compare(Student st1, Student st2) {
		return st1.getName().compareTo(st2.getName());
	}
	
	
}


