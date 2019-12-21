package WordsCounting.services;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderForFiles {
    public static String readFile(String filePath) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        return builder.toString();
    }
}
