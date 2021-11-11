package fr.imrann.openclassroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SymptomsReader implements SymptomsArrayList {
	
	private String fileSymptoms;
	
	public String ReadSymptomsFile (String fileSymptoms) {
		this.fileSymptoms = fileSymptoms;
		return fileSymptoms;
	}

	@Override
	public String symptomsList() {
		
		ArrayList<String> symptomsList = new ArrayList<String>();
				
				try {
					
					BufferedReader readSymptomsTxt = new BufferedReader(new FileReader("/Users/imrannjohn/Documents/Workspace-eclipse/Projet_Openclassroom/src/fr/imrann/openclassroom/symptoms.txt"));
					String line = readSymptomsTxt.readLine();
					
						if (line != null) {
					
							while (readSymptomsTxt != null) {
							symptomsList.add(line);
							line = readSymptomsTxt.readLine();
							}
					
							catch (IOException e) {
							e.printStackTrace();
							}
						
						}	
							
				}			
							
	}						
}
	

	
	
	
	


