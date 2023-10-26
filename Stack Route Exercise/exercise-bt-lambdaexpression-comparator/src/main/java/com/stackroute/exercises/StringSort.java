package com.stackroute.exercises;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringSort {

	// write here logic to sort a string List
	public String stringSorter(List<String> stringList, String sortingOrder) {
		String out = "";
		boolean flag = false,flag2=false;
		if (stringList == null || stringList.isEmpty() || sortingOrder == null || sortingOrder.isBlank()
				|| sortingOrder.isEmpty()) {
			out = "Given stringList or sortingOrder is empty, null or blank space";
		} else {
			for (String str : stringList) {
				if (str == null || str.isEmpty() || str.isBlank()) {
					out = "The list contains an empty or blank space value";
					flag = true;
				}
			}
			if (flag == false && stringList.size() == 1) {
				out = "The list contains only one value";
				flag2=true;
			}
			if(flag==false && flag2==false) {
				if (sortingOrder.equalsIgnoreCase("asc")) {
					List<String> result=stringList.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
					out+=result;
				}else if (sortingOrder.equalsIgnoreCase("desc")) {
					List<String> result=stringList.stream().sorted((s2,s1)->s1.compareTo(s2)).collect(Collectors.toList());
					out+=result;
				}else {
					out="No sorting order present for given string '"+sortingOrder+"' , 'asc' for ascending order sort and 'desc' for descending order sort";
				}
			}
			

		}
		return out;
	}
}