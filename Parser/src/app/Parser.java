package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class Parser {

	private Vector<Vector<Integer>> buffer = new Vector< Vector<Integer>>();
	private char delimiter = ';';
	
	public void LerArquivoEntrada(String path) throws FileNotFoundException {
		
		Scanner input = new Scanner(new FileReader(path));

		while(input.hasNextLine()) {
			
			String data = input.nextLine();
			
			if (data.startsWith("-")) {
				Vector<Integer> row = new Vector<Integer>();
				buffer.add(row);
			}
			else {
				buffer.lastElement().add(Integer.parseInt(data));
			}
		}
		
		input.close();
		
	}

	public Vector<Vector<Integer>> getBuffer() {
		
		return buffer;
	}

	public void setDelimiter(char delimiter) {
		this.delimiter = delimiter;
	}
	
	public char getDelimiter() {
		return delimiter;
	}
	

}
