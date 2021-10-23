package com.test;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedCharInString {
	
	public static void main(String[] args) {
		String s = "kjshdkafksjdhcskjvnskjvdskjvdnsmv slv";
		System.out.println();
		char[] chararray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<chararray.length;i++) {
			System.out.println(chararray[i]);
			if(map.containsKey(chararray[i])) {
				int count = map.get(chararray[i]) + 1;
				map.replace(chararray[i], count);
			} else {
				map.put(chararray[i], 1);
			}
		}
		System.out.println(map);
		int max = 0;
		char ch = ' ';
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(max<entry.getValue()) {
				max = entry.getValue();
				ch = entry.getKey();
			}
		}
		
		System.out.println(ch + "-" + max );
		
	}

}
