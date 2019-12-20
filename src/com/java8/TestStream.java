package com.java8;

import java.util.Arrays;
import java.util.List;

import com.java8.Dish;
import static java.util.stream.Collectors.toList;

public class TestStream {
	
	
	public static void main(String[] args){
		List<String> threeHighCalorieDishNames = getMenu().stream()
				.filter(d->d.getCalories()>300)
				.map(Dish::getName)
				.limit(3)
				.collect(toList());
		System.out.println(threeHighCalorieDishNames);
	}
	
	public static List<Dish> getMenu(){
		List<Dish> menu = Arrays.asList(
				new Dish("pork",false,800,Dish.Type.MEAT),
				new Dish("beef",false,700,Dish.Type.MEAT),
				new Dish("chicken",false,400,Dish.Type.MEAT),
				new Dish("french fries",true,530,Dish.Type.OTHER),
				new Dish("rice",true,350,Dish.Type.OTHER));
		return menu;
		
	}
	
	

}
