package www.sanyasdada.com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Legends{
	private String firstName;
	private String secondName;
	private int age;
	private Gender gender;
	private String attributes;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Legends(String firstName, String secondName, int age, Gender gender, String attributes) {
		
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.gender = gender;
		this.attributes = attributes;
	}
	

	
	  @Override public String toString() { 
		  return this.firstName +" "+this.secondName; 
		  }
	 

}

public class JavaStreamAPI2 {

	public static void main(String[] args) {
	List<Legends> listOflegends = Arrays.asList(
			new Legends("Dhankumari","Subedi",60,Gender.FEMALE,"FactoryOfKindeness"),
			new Legends("Laxmi","Poudel",23,Gender.FEMALE,"Patience"),
			new Legends("Steve","Jobs",53,Gender.MAlE,"Visionary"),
			new Legends("Bill","Gates",65,Gender.MAlE,"Creative"),
			new Legends("Elon","Musk",48,Gender.MAlE,"Workholic"),
			new Legends("Mark","Zukerberg",34,Gender.MAlE,"Smart"));
	   System.out.println(listOflegends);
		
	   // The allMatch() operation answers the question:
	   // Do all elements in the stream meet this condition?
	   // it returrns true if and only if all elements match a provided predicate, otherwise return false
	   
	   boolean areAllMale = listOflegends.stream().allMatch(p -> p.getGender().equals(Gender.MAlE));
	   System.out.println("Are the all legends male? " +areAllMale);
	   
	  //  the anyMatch() operation returns true if any element in the 
	  //  stream matches a provided predicate. In other words, answers the following question: is there any element that meets this condition?
     boolean anyFemale = listOflegends.stream()
                  .anyMatch(p -> p.getGender().equals(Gender.FEMALE));
	 System.out.println(anyFemale);
	 
	 
	 //allMatch() Operation. Does no element meet this conditions?
	 boolean endsWithdel = listOflegends.stream().noneMatch(p -> p.getSecondName().endsWith("Poudel"));
	
	System.out.println("No one comes form the Poudel family?" +endsWithdel);
	
     // the collect methods accumulates elements in a stream into
	// a container such as a collection. It performs  mutable reduction operation in which the reduced (final) value is a mutable
	//result container such as an ArrayList
	
	List<String> listAttributes = listOflegends.stream()
	             .map(p -> p.getAttributes())
	             .collect(Collectors.toList());
	System.out.println("List of Attributes: " + listAttributes);
	  
	
	// The following examples groups the person by gender
	Map<Gender,List<Legends>>byGender = listOflegends.stream()
	             .collect(Collectors.groupingBy(p -> p.getGender()));
	 System.out.println("Groups by gender:\n" +byGender);
	}
	
	
	
	
	
	
	
	

}
