import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		String filePath = "file.txt";
		System.out.println(readLineByLine(filePath, count));	
	}

	private static String readLineByLine(String filePath, int count) {
		StringBuilder contentBuilter = new StringBuilder();
		
		try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)){
			stream.forEach(s -> contentBuilter.append(s).append("\n"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		String string = contentBuilter.toString();
		System.out.println(string);
		String removeSpace = string.replace(" ", "");
		return removeSpace;
	}
}

