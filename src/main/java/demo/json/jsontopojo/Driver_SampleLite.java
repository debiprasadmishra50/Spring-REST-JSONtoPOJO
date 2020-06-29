package demo.json.jsontopojo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver_SampleLite 
{
	public static void main(String[] args) 
	{
		try {
			
			// create a ObjectMapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Read a JSON file and map/convert to Java POJO: data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			// print the details of the Student
			System.out.println("Student ID is : "+theStudent.getId());
			System.out.println("Student First Name is : "+theStudent.getFirstName());
			System.out.println("Student Last Name is : "+theStudent.getLastName());
			System.out.println("Student Email is : "+theStudent.getEmail());
			System.out.println("Student Status is : "+theStudent.isActive());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
