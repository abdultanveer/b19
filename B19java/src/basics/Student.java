package basics;

public class Student {
	
	public static String COLLEGE_NAME = "IIT";
	int age;    //partion 1
	String name; //partition 2
	
	/**
	 * default constructor
	 */
	public Student() {//hongcheng
		this(123);
		System.out.println("default constructor called");
	}
	
	public Student(int mage) { //qi
		System.out.println("parameterized constructor called");
		this.age = mage;
	}

	public static void display() {
		System.out.println("this method can be called without creating the object of student");
	}
	
	
	public Student(int age, String name) {//james
		System.out.println("parameterized constructor called");
		this.age = age;
		this.name = name;  //this.age is a partition of the box
	}




	public static void main(String[] args) {
		
		Student abdul = new Student(123,"ansari");
		Student abdul1 = new Student(123);
		
		System.out.println(abdul.name);
		Student.display();
		//System.out.println(Student.COLLEGE_NAME);

	}

}
