package 스태틱;

public class 직원 {
	String name;
	int age;
	char gender;
	static int count;
	static int sum;

	public 직원(String name, int age, char gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		sum = sum + age; // sum += age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}