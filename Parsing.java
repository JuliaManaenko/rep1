package test.testtest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Parsing {

	private String name;
	private String course;
	private String age;
	
	@JsonCreator
	public Parsing(@JsonProperty("name")String name, @JsonProperty("course")String course, @JsonProperty("age")String age){
		this.name = name;
		this.course = course;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getCourse(){
		return course;
	}
	public void setCourse(String course){
		this.course = course;
	}
	
	public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age = age;
	}

}
