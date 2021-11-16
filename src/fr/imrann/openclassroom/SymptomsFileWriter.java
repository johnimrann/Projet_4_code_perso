package fr.imrann.openclassroom;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class SymptomsFileWriter {

	public static void symptomsFileWriter(String filepath, Map<String, Integer> map) {
		File file = new File(filepath);
		
		BufferedWriter bf = null;;
		
		try{
		    
		    //create new BufferedWriter for the output file
		    bf = new BufferedWriter( new FileWriter(filepath) );
 
		    //iterate map entries
		    for(Entry<String, Integer> entry : map.entrySet()){
		        
		        //put key and value separated by a colon
		        bf.write( entry.getKey() + ":" + entry.getValue() );
		        
		        //new line
		        bf.newLine();
		    }
		    
		    bf.flush();
 
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    
		    try{
		        //always close the writer
		        bf.close();
		    }catch(Exception e){}
		}
	}
}
