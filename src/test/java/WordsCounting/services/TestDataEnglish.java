package WordsCounting.services;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestDataEnglish {
    private static String withoutSpecialCharacters = "Our city stands on the river. I love my native city.";

    public static String getWithoutSpecialCharacters() {
        return withoutSpecialCharacters;
    }

    public static String getWithSpecialCharacters() {
        return withSpecialCharacters;
    }

    public static Map<String, Integer> getWithoutSpecialCharactersResult() {
        return withoutSpecialCharactersResult;
    }

    public static Map<String, Integer> getWithSpecialCharactersResult() {
        return withSpecialCharactersResult;
    }

    private static String withSpecialCharacters = "High *above it & all (Above it all) Victorious, victorious" +
            " Far too long I have grown (Far too long)...///";

    private static Map<String, Integer> withoutSpecialCharactersResult = initWithoutSpecialCharactersResult();
    private static Map<String, Integer> withSpecialCharactersResult = initWithSpecialCharactersResult();

    private static Map<String, Integer> initWithoutSpecialCharactersResult() {
        Map<String, Integer> withoutSpecialCharactersResult = new LinkedHashMap<>();
        withoutSpecialCharactersResult.put("our", 1);
        withoutSpecialCharactersResult.put("city", 2);
        withoutSpecialCharactersResult.put("stands", 1);
        withoutSpecialCharactersResult.put("on", 1);
        withoutSpecialCharactersResult.put("the", 1);
        withoutSpecialCharactersResult.put("river", 1);
        withoutSpecialCharactersResult.put("i", 1);
        withoutSpecialCharactersResult.put("love", 1);
        withoutSpecialCharactersResult.put("my", 1);
        withoutSpecialCharactersResult.put("native", 1);
        return withoutSpecialCharactersResult;
    }

    private static Map<String, Integer> initWithSpecialCharactersResult() {
        Map<String, Integer> withSpecialCharactersResult = new LinkedHashMap<>();
        withSpecialCharactersResult.put("high", 1);
        withSpecialCharactersResult.put("above", 2);
        withSpecialCharactersResult.put("it", 2);
        withSpecialCharactersResult.put("all", 2);
        withSpecialCharactersResult.put("victorious", 2);
        withSpecialCharactersResult.put("far", 2);
        withSpecialCharactersResult.put("too", 2);
        withSpecialCharactersResult.put("long", 2);
        withSpecialCharactersResult.put("i", 1);
        withSpecialCharactersResult.put("have", 1);
        withSpecialCharactersResult.put("grown", 1);
        return withSpecialCharactersResult;
    }
}