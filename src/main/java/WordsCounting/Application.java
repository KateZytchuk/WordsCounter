package WordsCounting;

import WordsCounting.services.ReaderForFiles;
import WordsCounting.services.WordsCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.logging.Logger;

public class Application {

    private static final Logger logger = Logger.getLogger(Application.class.getName());

    private static final String  ENGLISH_TEXT = ".\\src\\Files\\English.txt";
    private  static  final  String RUSSIAN_TEXT = ".\\src\\Files\\Russian.txt";

    public static void main(String[] args) {
        try {
            boolean check = isContainsWords(ENGLISH_TEXT);
            if(check) {
                String str = ReaderForFiles.readFile(ENGLISH_TEXT);
                Map<String, Integer> result = WordsCounter.getOccurrenceOfEachWord(str);
                printResult(result);
            }else{
                logger.info("Your file doesn`t contains any words!");
            }
        } catch (Exception ex) {
            logger.warning(ex.getMessage());
        }
    }

    private  static void printResult(Map<String, Integer> result) {
        for (Map.Entry<String, Integer> print : result.entrySet()) {
            int number = print.getValue();
            String value = print.getKey();
            logger.info(number + " - " + value);
        }
    }
    private static boolean isContainsWords(String filePath)throws Exception{
        boolean result = false;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        if(reader.readLine()!=null){
            result = true;
        }
        return result;
    }
}