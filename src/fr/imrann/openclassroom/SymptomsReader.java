package fr.imrann.openclassroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class SymptomsReader implements SymptomsArrayList {
	
	
	
	BufferedReader symptomsReader = new BufferedReader(new FileReader("/Users/imrannjohn/Documents/Workspace-eclipse/Projet_Openclassroom/src/fr/imrann/openclassroom/symptoms.txt"));
	String line = symptomsReader.readLine();
	
	
	

		

	public ArrayList<String> symptomsList() {
		
			ArrayList<String> symptomsList = new ArrayList<String>();	
				
				try {
					
					
					
				
						if (line != null) {
							
							symptomsList.add(line);
							line = symptomsReader.readLine();
							System.out.println(symptomsList());

							
						}
				}
				
				catch (IOException e) {
					e.printStackTrace();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			
					return symptomsList();
				
	}

	public static void main(String args[]){
		SymptomsReader sr = new SymptomsReader();

	}
	
}


	
	
	
	


