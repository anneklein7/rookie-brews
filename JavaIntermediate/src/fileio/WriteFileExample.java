package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
		Writer w=new FileWriter("/Users/annechafer/Documents/doctest.rtf"); //opens file
		String content = "Sing, O goddess, the anger of Achilles son of Peleus, that brought countless ills upon the Achaeans."
				+ "Many a brave soul did it send hurrying down to Hades, and many a hero did it yield a prey to dogs\n"
				+ "and vultures, for so was the will of Zeus fulfilled from the day on which the son of Atreus, king of men, and great Achilles, first fell out with one another. ";
		w.write(content); // does the writing
		w.close(); // closes file
		System.out.println("File written successfully");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
