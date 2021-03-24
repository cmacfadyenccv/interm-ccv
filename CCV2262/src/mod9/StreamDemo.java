package mod6;

import java.io.*;

import java.util.Scanner;


public class StreamDemo {

	public static void main(String[] args) {
				
		try {
			/*
			//Reading
			File textFile = new File("txt/file_example.csv");
			FileReader fr = new FileReader(textFile);
			BufferedReader br = new BufferedReader(fr);
			
			PrintWriter pw = new PrintWriter(System.out);
			
			 int lineCounter = 0;
				String nextLine;
				while(lineCounter < 100 && (nextLine = br.readLine()) != null) {
				pw.println(nextLine);
				lineCounter++;
				}
				*/
			//Writing
			
			File writeFile = new File("txt/names.txt");
			FileWriter fw = new FileWriter(writeFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Scanner kbd = new Scanner(System.in);
			
		    String writeLine = "start";
		    while(!writeLine.equals("stop")){
		    	writeLine = kbd.nextLine();
		    	bw.write(writeLine);
		    	bw.newLine();
		    } 
			
			
			//br.close();
			//pw.close();
			bw.close();
		
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		

	}

}
