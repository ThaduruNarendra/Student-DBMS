package sdbms;

public class Student {

	private Integer id;
	private Integer age;
	private String name;
	private Integer marks;
	
	public Student(Integer id, Integer age, String name, Integer marks) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Id: "+id+" Age: "+age+" Name: "+name+" Marks: "+marks;
	}
	
}
