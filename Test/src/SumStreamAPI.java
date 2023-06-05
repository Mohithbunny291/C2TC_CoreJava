import java.util.Arrays;
import java.util.List;

public class SumStreamAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list1 = Arrays.asList(12,20,35,46,55,68,75);
		System.out.println(list.stream().map(i -> i*2).reduce(0, (c,s) -> (s*s)));
		System.out.println(list.stream().map(i -> i+i));
		System.out.println(list1.stream().filter(i -> i%5 == 0).map(i -> i*2).reduce(0, (c,s) -> (c+s)));
	}

}
