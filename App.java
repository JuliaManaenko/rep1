package test.testtest;





import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;







import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException {
    ArrayList<String> list = new ArrayList<String>();
	InputStream input = new FileInputStream("students.json");
	ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	TypeFactory typeFactory = TypeFactory.defaultInstance();
	List<Parsing> students = objectMapper.readValue(input,
			typeFactory.constructCollectionType(
					ArrayList.class, Parsing.class));
	
for(int i = 0; i<students.size(); i++){
//	System.out.println(students.get(i).getName() + ' ' + students.get(i).getCourse() + ' ' + students.get(i).getAge());

list.add(i, students.get(i).getName() + ' ' + students.get(i).getCourse() + ' ' + students.get(i).getCourse());
	
}
System.out.println("The default list of students:");
for(int i=0; i<list.size(); i++){
	System.out.println(list.get(i));
}

//System.out.println(list);
Collections.sort(list);
//System.out.println(list);
System.out.println("\nThe sorting list of students:");
for(int i=0; i<list.size(); i++){
	System.out.println(list.get(i));
}


}
}
