package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 44, 2, 2, 22, 5, 35, 81, 24, 30, 9, 4, 41);
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 85, 20, 1));
		students.add(new Student("Bob", 90, 21, 2));
		students.add(new Student("Charlie", 75, 22, 3));
		students.add(new Student("David", 88, 23, 4));
		students.add(new Student("Eve", 92, 21, 5));
		students.add(new Student("Frank", 80, 24, 6));
		students.add(new Student("Grace", 87, 22, 7));
		students.add(new Student("Hank", 70, 23, 8));
		students.add(new Student("Ivy", 95, 20, 9));
		students.add(new Student("Jack", 78, 22, 10));
		students.add(new Student("Kathy", 89, 21, 11));
		students.add(new Student("Leo", 85, 23, 12));
		students.add(new Student("Mona", 93, 24, 13));
		students.add(new Student("Nina", 91, 22, 14));
		students.add(new Student("Oscar", 82, 23, 15));

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Vishal", 100, 20, 16));
		studentList.add(new Student("Kumar", 87, 22, 17));
		studentList.add(new Student("Sunil", 65, 21, 18));
		studentList.add(new Student("Sharma", 52, 23, 19));
		studentList.add(new Student("Bhai", 48, 24, 20));
		System.out.println("Started....");
		
		Map<Integer,Student> temp = 	students.stream().collect(Collectors.toMap(Student::getRoll, s->s));
		temp.forEach((id,stud)->System.out.println(id+","+stud));
		
		
		//average marks
		double averageMarks = students.stream().map(Student::getMarks).collect(Collectors.averagingDouble(marks->marks));
		System.out.println("Average marks-->"+averageMarks);
		
	 Map<Integer,List<Student>> ageGroup = 	students.stream().collect(Collectors.groupingBy(Student::getAge));
	 ageGroup.forEach((key,value)->System.out.println(key+","+value));
		
		list.stream().mapToInt(i->i).max();
		
		
		// 1 . All match ---> return true is predicate id true for all element
		boolean isAllPass = students.stream().allMatch(student -> student.marks > 40);
		System.out.println("All student pass--->" + isAllPass);

		// 2. anyMatch() if any of the element meet the condition it will return true
		boolean outstandinMarks = students.stream().anyMatch(student -> student.marks >= 90);
		System.out.println("Is any student got more than 90 marks--->" + outstandinMarks);

		// 2. Builder
		Stream.builder().add("hello");
		Stream.Builder<Student> studentStream = Stream.builder();
		studentStream.add(new Student("test", 10, 20,22)).build();

		// 3. concat

		Stream<Student> s1 = students.stream();
		Stream<Student> s2 = studentList.stream();
		Stream.concat(s1, s2);

		// or
		Stream.concat(students.stream(), studentList.stream()).forEach(s -> {
		});

		// 4. count
		long totalStudent = studentList.stream().count();
		System.out.println("Total student is 1st list--> " + totalStudent);

		// 5. distinct
		list.stream().distinct().forEach(System.out::println);

		// 6. findAny ---> it will return any random element form stream
		int random = list.stream().findAny().get();
		System.out.println("Random number from list is= " + random);

		// 7. findFirst() ---> it will return first element of stream
		int firstElement = list.stream().findFirst().get();
		System.out.println("First Element is = " + firstElement);

		// 8.generate --> it will call supplier and what ever value supplier return it
		// will store it in stream
		Random rand = new Random();

		Stream<Integer> randomNumbers = Stream.generate(() -> rand.nextInt(100)).limit(10);

		randomNumbers.forEach(System.out::println);

		// 9. limit ---> use to crop the stream element
		list.stream().limit(4);

		// 10 . mapToInt
		int maxMarks = students.stream().mapToInt(Student::getMarks).max().getAsInt();
		System.out.println("Max marks is = " + maxMarks);

	}

}
