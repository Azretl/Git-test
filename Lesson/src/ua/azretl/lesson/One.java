package ua.azretl.lesson;

import java.util.ArrayList;
import java.util.Random;

public class One {
	private static ArrayList<Dog> dog =new ArrayList<Dog>(); // клас который позволяет создавать масив внутри масива 
    private static Random ran = new Random();

	public static void main(String[] args){
    	for(int i=0; i<300; i++){
    		dog.add(new Dog(ran.nextInt(9), "Pizdec"));
    	}
    	for(Dog d: dog ){
    		System.out.println(d.getNumber()+" "+d.getName());
    	}
    }
	}

	
	 