package Package1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileThing {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("cricket.txt");
		PrintWriter out=new PrintWriter(fw);
		out.write("Tejas");
		out.write(10);
		out.print("Most");
		out.println("Used");
		out.flush();
		fw.close();
	}

}
