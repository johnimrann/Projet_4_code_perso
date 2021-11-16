package fr.imrann.openclassroom;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

			SymptomsReader sr = new SymptomsReader();
			ArrayList<String> ls = sr.symptomsLink("/Users/imrannjohn/Documents/Workspace-eclipse/Projet_Openclassroom/src/fr/imrann/openclassroom/symptoms.txt");
			//System.out.println("Before sort result : " + ls);
			
			// Sort Symptoms file with Collections class and thanks to .sort method :
			Collections.sort(ls);
			//System.out.println("After sort result : " + ls);
			
			CounterSymptoms cs = new CounterSymptoms();
			Map<String, Integer> counterSym = cs.counter(ls);
			//System.out.println(counterSym);
			
			// Create TreeMap for sort countSymptoms Map :
			TreeMapSymptoms ts = new TreeMapSymptoms();
			ts.treeMap(counterSym);
			
			
			
			  
			 
		   
				
	}

	

	
			
	
	}


			



