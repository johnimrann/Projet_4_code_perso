package fr.imrann.openclassroom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

			ArrayList<String> ls = SymptomsReader.symptomsLink("/Users/imrannjohn/Documents/Workspace-eclipse/Projet_Openclassroom/src/fr/imrann/openclassroom/symptoms.txt");
			//System.out.println("Before sort result : " + ls);
			
			// Sort Symptoms file with Collections class and thanks to .sort method :
			Collections.sort(ls);
			//System.out.println("After sort result : " + ls);
			
			Map<String, Integer> counterSym = CounterSymptoms.counter(ls);
			//System.out.println(counterSym);
			
			// Create TreeMap for sort countSymptoms Map :
			TreeMapSymptoms.treeMap(counterSym);
			
			// Create new Map
			Map<String, Integer> counterSymTreeMap = TreeMapSymptoms.treeMap(counterSym);
			
			// 
			SymptomsFileWriter.symptomsFileWriter("/Users/imrannjohn/Documents/Workspace-eclipse/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/result.out",counterSymTreeMap);
			
			}

	
	}
				
			

	

	
			
	
	


			



