package exam.prototype;

public class Dog extends Proto {
	
	String name;
	int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Dog copy() {
		Dog dog = null;
		try {
			dog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return dog;
	}
	
	
}
