import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> course = new ArrayList<>();
		course.add("Java");
		course.add("JavaSE");
		course.add("Java Web");
		course.add("Java SE");
		
		//和数组一样，允许添加重复元素
		course.add("Java");

		//按照添加顺序打印
		System.out.println(course);
		
		//类似数组下表的方式访问
		System.out.println(course.get(0));
		
		System.out.println(course);

		System.out.println(course);
		course.set(0, "C语言");
		System.out.println(course);

		//截取部分[1,2)
		List<String> subcourse = course.subList(1, 2);
		System.out.println(subcourse);

		//重新构造
		List<String> course2 = new LinkedList<>(course);
		System.out.println(course2);

		List<String> course3 = new LinkedList<>(course);
		System.out.println(course3);

		System.out.println("==================");
		//引用的转换
		ArrayList<String> course4=(ArrayList<String>)course2;
		System.out.println(course4);
		//LinkedList<String> c=(LinkedList<String>)course2;错误的类型
		LinkedList<String> course5=(LinkedList<String>)course3;
		System.out.println(course5);
		//ArrayList<String> c=(ArrayList<String>)course3;错误类型
	}
}
