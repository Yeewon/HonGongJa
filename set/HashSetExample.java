package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("yeewon");
		set.add("jung");
		set.add("java");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //��ü ����ŭ ����
			String element = iterator.next(); //�ϳ��� ��ü�� �����´�.
			System.out.println(element);
		}
	}

}
