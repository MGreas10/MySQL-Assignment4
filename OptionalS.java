package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

import sortingfile.Student;

public class OptionalS {	
	
	public static void main(String[] args) {
		Optional<Student> student = Optional.ofNullable(null);
		System.out.println(methodB(student));
	
	}
	
	
	public static Student methodA (Optional <Student> studentOPtional) {
		
		return studentOPtional.orElseThrow(()-> new NoSuchElementException("Your object is empty"));
		
	}
	
	
	public static Student methodB (Optional <Student> studentOPtional) {
		
		 
		try {
			 methodA(studentOPtional); 
			
			} catch (NoSuchElementException e) {
				System.out.println (e.getMessage());
			}
		return methodA(studentOPtional);  
				
	}	
}