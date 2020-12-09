import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseOnEmployee {

	public static void main(String[] args) {
		/**
		List<Employee> employees = Arrays.asList(
				new Employee("pankaj","sharma",40000),
				new Employee("aman","soni",20000),
				new Employee("suman","arya",50000));
		
		Collections.sort(employees, new Employee());
		Stream<Integer> integerStream = Stream.of(10,20,30,20);
		List<Integer> ls = integerStream.filter((Integer i)->{
			if(i%3==0)
				return true;
			return false;
		}).collect(Collectors.toList());
		System.out.println(ls);
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		Stream<Integer> listStream = list.stream();
		System.out.println(listStream.limit(1).findAny());
		String[] strng = new String[] {"IGATE","GLOBAL","SOLUTION"};
		Stream<String> arrayStream = Arrays.stream(strng);
		arrayStream.forEach((value)->{
			System.out.println(value);
			}
		);

		arrayStream.map((str)->str.length()).forEach(System.out::println);
		BiFunction<Integer,Integer,Integer> max = (x,y)->(x>y)?x:y;
		System.out.println(max.apply(5, 52));

	*/
		List<String> trainers = new ArrayList<String>();
		trainers.add("Soham");
		trainers.add("Tina");
		trainers.add("Anju");
		trainers.add("Kavya");
		trainers.add(null);
		trainers.add("null");
		trainers.add("Soham");
		trainers.add("Tina");
		System.out.println(trainers);
		
		Set<String> list = trainers.stream().filter(s->s.startsWith("S")).collect(Collectors.toSet());
		System.out.println(list);
	}

}
