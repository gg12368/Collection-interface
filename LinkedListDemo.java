import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建LinkedList集合
		LinkedList link = new LinkedList();
		// 1.添加元素
		link.add("hello1");
		link.add("hello2");
		System.out.println(link);
		link.offer("offer");// 向集合尾部追加元素
		link.push("push");// 向集合头部追加元素
		System.out.println(link);

		// 2.获取元素
		Object object = link.peek();// 获取集合第一个元素
		System.out.println(object);

		link.removeFirst();// 删除集合第一个元素
		link.pollLast();// 删除集合最后一个元素
		System.out.println(link);
	}
}
