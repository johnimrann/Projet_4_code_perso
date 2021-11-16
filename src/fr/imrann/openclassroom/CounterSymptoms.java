package fr.imrann.openclassroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CounterSymptoms {
	public static Map<String, Integer> counter(ArrayList<String> list) {
		Map<String, Integer> countSymptoms = new HashMap<>();
		
		
		// Create loop for symptoms recurrence count :
		
		for (String symptoms : list) {
		    Integer count = countSymptoms.get(symptoms);
		    
		    if(count == null) {
		        count = 0;
		        } 
		    
		    countSymptoms.put(symptoms, (count.intValue()+1));
		}
		return countSymptoms;
	}

}
