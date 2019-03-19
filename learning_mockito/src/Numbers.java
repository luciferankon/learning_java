import java.util.ArrayList;

public class Numbers implements Range<Integer> {
	ArrayList<Integer> list;

	public Numbers() {
		this.list = new ArrayList<Integer>();
	}

	@Override
	public void getAll(Integer start, Integer end) {
		for (int i = start; i <= end;i++) {
			list.add(i);
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	@Override
	public boolean contains(Integer element) {
		return list.contains(element);
	}
}
