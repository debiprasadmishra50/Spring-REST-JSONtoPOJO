package demo.json.jsontopojo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver_SampleFull 
{
	public static void main(String[] args) 
	{
		try {
			
			// create a ObjectMapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Read a JSON file and map/convert to Java POJO: data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print the details of the Student
			System.out.println("Student ID is : "+theStudent.getId());
			System.out.println("Student First Name is : "+theStudent.getFirstName());
			System.out.println("Student Last Name is : "+theStudent.getLastName());
			System.out.println("Student Email is : "+theStudent.getEmail());
			System.out.println("Student Status is : "+theStudent.isActive());
			System.out.println("Student Address is : "+theStudent.getAddress());
			System.out.println("Student Address Street is : "+theStudent.getAddress().getStreet());
			
			String[] studentLanguages = theStudent.getLanguages();
			for (String languages : studentLanguages) {
				System.out.println("Student Languages are : "+languages);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
