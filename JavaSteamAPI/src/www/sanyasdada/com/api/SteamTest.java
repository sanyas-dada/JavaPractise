package www.sanyasdada.com.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class People implements Comparable<People> {
	private String firstName;
	private String secondName;
	private int age;
	private Gender gender;

	public People(String firstName, String secondName, int age, Gender gender) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.gender = gender;
	}
	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// return String.format("%s %s-%d",firstName,secondName,age);
		return this.firstName + " " + this.secondName;

	}

	@Override
	public int compareTo(People people) {
		// TODO Auto-generated method stub
		// return this.getFirstName().compareTo(people.getFirstName());
		return this.age - people.age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}

public class SteamTest {

	public static void main(String[] args) {
		List<People> people = Arrays.asList(
				new People("Laxmi", "Subedi", 23, Gender.FEMALE),
				new People("Jyoti", "Poudel", 23, Gender.FEMALE), 
				new People("Bibash", "Subedi", 29, Gender.MAlE),
				new People("Sunil", "Tharu", 25, Gender.MAlE), 
				new People("Sandesh", "Rijal", 24, Gender.MAlE));
		System.out.println("Before sorting:" + people);
		Collections.sort(people);
		System.out.println("After sorting:" + people);

		System.out.println("Lists of Males:");

		// using lambda expression without using comparable interfaces and compare to
		// method
		people.stream().filter(p -> p.getGender().equals(Gender.MAlE)).forEach(System.out::println);

		// The following codes shows only female who under the 25
		people.stream().filter(p -> p.getGender().equals(Gender.FEMALE) && p.getAge() <= 25)
				.forEach(System.out::println);

		/*
		 * every collection class has the stream() method that returns a steam of
		 * elements in the collections.
		 */
		
		   // the following code maps each person to his/her respective firstName
          people.stream()
///                .map(p -> p.getFirstName())
                .forEach(System.out::println);
          
          
         // the following code maps each person to his/her age:
          people.stream()
                .mapToInt(p -> p.getAge())
                .forEach(age ->System.out.print(age + " -"));
          System.out.println("___________");
          // the following examples maps each person to his/her first name in uppercase
          people.stream()
                .map(p ->p.getFirstName().toUpperCase())
                .forEach(System.out::println);
          
          // the following examples returns a stream of persons who are sorted by their age into ascending order
          people.stream()
                .sorted()
                .forEach(p ->System.out.println(p + " - " +p.getAge()));
          
          
          
          // The following codes shows how to use a specified comparator to return a steams of persons who are sorted by their last name
          people.stream()
                .sorted((p1,p2) -> p1.getSecondName().compareTo(p2.getSecondName()))
                .forEach(System.out::println);
          
          // the limit() operation returns a stream containing  only a specified number of elements. 
          // Combining with the sorted operation, the following example show top 3 youngest persons
           people.stream()
                 .sorted()
                 .limit(3)
                 .forEach(System.out::println);
          
          
           //The skip() operation returns a stream containing the remaining elements
           //after discarding the first n elements  of the stream.
           
           
           // Combining with the sorted and map operations, the following example finds
           // the oldest age of the persons 
           System.out.println("The oldest age: ");
           people.parallelStream()
                 .sorted()
                 .map(p -> p.getAge())
                 .skip(people.size() - 2)
                 .forEach(System.out::println);
                 
           
          
          
          
          
          
	}

}
