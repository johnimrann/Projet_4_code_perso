package fr.imrann.openclassroom;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSymptoms {
	public static void treeMap(Map<String, Integer> counter) {
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(counter);
		  for (Map.Entry<String ,Integer> entry:treeMap.entrySet()) {
		  System.out.println(entry); }
	}
}
