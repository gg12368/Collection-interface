import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person {
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person{" + "name='" + name + '\'' + ",age=" + age + '}';
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name) && Objects.equals(age, person.age);
	}

	public String getName() {
		return name;
	}

	public void getName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void getAge(Integer age) {
		this.age = age;
	}
}

public class TestDemo {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("张三", 10));
		personList.add(new Person("李四", 11));
		personList.add(new Person("王五", 12));
		// 集合类中contains()、remove()方法需要equals()支持
		personList.remove(new Person("李四", 11));
		System.out.println(personList.contains(new Person("王五", 12)));
		for (Person p : personList) {
			System.out.println(p);
		}
	}
}
