package fr.imrann.openclassroom;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SymptomsReader {
											
	public ArrayList<String> symptomsList(String filepath) {
		ArrayList<String> symptomsList = new ArrayList<String>();
		
		
			if(filepath != null ) {
					try {
							Scanner scnSymptoms = new Scanner (new FileReader(filepath));
								
								while(scnSymptoms.hasNextLine()) {
									String ln = scnSymptoms.nextLine();
									System.out.println(ln);
									symptomsList.add(ln);
									
								}
								
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Fichier non trouvé!");
					e.printStackTrace();
				}
					finally {
						System.out.println("Fini!");
					}					
			}
			return symptomsList;
 }
	public static void main(String[] args) {
		SymptomsReader sr = new SymptomsReader();
		ArrayList<String> ls = sr.symptomsList("/Users/imrannjohn/Documents/Workspace-eclipse/Projet_Openclassroom/src/fr/imrann/openclassroom/symptoms.txt");
		System.out.println("Résultat avant tri: " + ls);
		Collections.sort(ls);
		System.out.println("Résultat après tri: " + ls);
		
	}
}

	

	





	

	
	


