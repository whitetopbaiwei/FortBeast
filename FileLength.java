import java.util.io.*;

public class FileLength{
	public static void main(String[] args){
		int count = 0; 
		InputStream streamReader = null;
		if (args.length < 1){
			System.out.println("Usage:java FileLength <filename>");
			System.exit(0);
		}
		try {
			streamReader = new FileInputStream(args[0]);
			while (streamReader.read())
		}

	}
}