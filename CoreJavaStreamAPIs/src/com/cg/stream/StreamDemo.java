package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list1 = Arrays.asList(12,30,35,46,55,68,75);
		
		list1.forEach(n -> System.out.println(n));
		
		Stream<Integer> data = list.stream();
		
		/*
		 * long count = data.count(); System.out.println(count); data.forEach(n ->
		 * System.out.println(n));
		 */
		
		/*
		 * data.forEach(n -> System.out.println(n)); In a stream the data objects 
		 * that are created will only have its functionality once. 
		 * This will not work because the stream object will function only once and 
		 * it will close its functionality. If we need to perform any option the 
		 * stream object has to be created with a different object name has to be created. 
		 */
		
		
		System.out.println("\n" + list.stream()
									  .map(i -> i*2)
									  .reduce(0, (c,s) -> (s*s))+"\n");
		
		list.stream()
			.map(i -> i+i)
			.forEach(n -> System.out.println(n));
		
		System.out.println("\n"+list1.stream()
									 .filter(i -> i%5 == 0)
									 .map(i -> i*2)
									 .reduce(0, (c,s) -> (c+s)));
		
		System.out.println("\n\n\n"+ list1.stream()
				.filter(StreamDemo :: isDivisible)
				.map(StreamDemo :: mapDouble)
				.findFirst()
				.orElse(0));
		
	}
	public static boolean isDivisible(int i) {
		System.out.println(i);
		return i%5 == 0;
	}
	public static int mapDouble(int i) {
		System.out.println(i);
		return i*2;
	}
}
