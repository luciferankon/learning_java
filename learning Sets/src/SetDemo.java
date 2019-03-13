import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> firstSet = Set.of("1","2");
		Set<String> copyFirstSet1 = new HashSet<>(Set.copyOf(firstSet));
		Set<String> copyFirstSet2 = new HashSet<>(Set.copyOf(firstSet));
		Set<String> copyFirstSet3 = new HashSet<>(Set.copyOf(firstSet));
		Set<String> secondSet = Set.of("1","3","5");
		Set<String> copySecondSet1 = Set.copyOf(secondSet);
		Set<String> copySecondSet2 = Set.copyOf(secondSet);
		Set<String> copySecondSet3 = Set.copyOf(secondSet);
		copyFirstSet1.addAll(copySecondSet1);
		copyFirstSet2.removeAll(copySecondSet2);
		copyFirstSet3.retainAll(copySecondSet3);

		System.out.println("Union  "+ copyFirstSet1);
		System.out.println("Intersection  "+copyFirstSet3);
		System.out.println("Difference  "+copyFirstSet2);

		System.out.println("----------------------------");

		System.out.println("Union  "+Sets.union(firstSet,secondSet));
		System.out.println("Intersection  "+Sets.intersection(firstSet,secondSet));
		System.out.println("Difference  "+Sets.difference(firstSet,secondSet));
	}
}
