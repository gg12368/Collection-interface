import java.util.List;
import java.util.Vector;

public class TestDemo {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("hello");
		list.add("hello");
		list.add("myself");
		System.out.println(list);
		list.remove("hello");
		System.out.println(list);
	}
}
