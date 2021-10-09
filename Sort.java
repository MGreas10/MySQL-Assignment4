package sortingfile;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sort {
	
	   static Comparator<Student> comp = null;
	   
        static List<Student> students = List.of(
		new Student("Michael"),
		new Student("Jack"),
		new Student("Smith"),
		new Student("Abel"));
	
	public static void main(String[] args) {
		
//		System.out.println(Stream.streamOfStrings());
		sortStudentsUsingLambdaExpresession(students);	
	}
	
	public static List<Student> getStudents(){
		return students;
	}

	// method to sort the objects using a lambda expression to the compare method you created earlier
	
	public static List<Student> sortStudentsUsingLambdaExpresession(List<Student> students){
		 comp = (st1, st2)-> Student.compare(st1,st2);
		 students.sort(comp);
		 students.forEach(student->System.out.println(student.getName()));		
		  return students;
	}
	
	
	public static String sortStudentsUsingReferenceMethod(List<Student> students){
		comp = Student:: compare;
		 return students.forEach(System.out::println);
		
	}

}
