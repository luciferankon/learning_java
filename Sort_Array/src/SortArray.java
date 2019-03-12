public class SortArray {
	public static void main(String[] args) {
		int[] numbers = {12, 3, 4, 2, 7};
		int temp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if(numbers[i] <= numbers[j]){
					temp = numbers[i];
					numbers[i]= numbers[j];
					numbers[j]=temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
