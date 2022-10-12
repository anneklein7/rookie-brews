package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetsExample {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Mark");
		hashSet.add("Johnny");
		hashSet.add("Taeyong");
		hashSet.add("Jaehyun");
		hashSet.add("Taeil");
		hashSet.add("Doyoung");
		hashSet.add("Doyoung"); // this will overwrite the previous "Doyoung", as duplicate values are not permitted
		hashSet.add("Jungwoo");
		hashSet.add("Yuta");
		hashSet.add("Haechan");
		hashSet.add("Chenle");
		System.out.println(hashSet);
		
		System.out.println("Is this hash set empty?");
		if (hashSet.size() == 0) {
			System.out.println(hashSet.isEmpty());
		}
		else {
			System.out.println("No, its size is:");
			System.out.println(hashSet.size());
		}
		
		hashSet.remove("Chenle");
		System.out.println("Now the set does not contain the element Chenle");
		System.out.println(hashSet);
		
		hashSet.contains("Taeyong"); // will return true
		
		/* hashSet.clear();
		System.out.println("Now the set is clear of all elements");
		System.out.println(hashSet); */
	}
}
