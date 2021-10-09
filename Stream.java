package sortingfile;

import java.util.stream.Collectors;

public class Stream {
	
	 Stream stream = new Stream();
	
 public static String streamOfStrings(){
	 String streamOfStrs = 
			 Sort.getStudents().stream()
			 .map(student -> student.getName().toString()).sorted()
			 .collect(Collectors.joining(", "));
	 return streamOfStrs;
 }
	 
}

