package fr.imrann.openclassroom;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SymptomsReader {
											
	public static ArrayList<String> symptomsLink(String filepath) {
		ArrayList<String> symptomsList = new ArrayList<String>();
		
		
			if(filepath != null ) {
					try {
							Scanner scnSymptoms = new Scanner (new FileReader(filepath));
								
								while(scnSymptoms.hasNextLine()) {
									String ln = scnSymptoms.nextLine();
									symptomsList.add(ln);
									
								}
								
				} catch (FileNotFoundException e) {

					System.out.println("Fichier non trouvé!");
					e.printStackTrace();
				}
					finally {
						System.out.println("Fichier trouvé !");
					}					
			}
			return symptomsList;
 }
	
}

	

	





	

	
	


