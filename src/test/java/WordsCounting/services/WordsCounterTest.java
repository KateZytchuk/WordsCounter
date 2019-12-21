package WordsCounting.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class WordsCounterTest {
//TODO 1: Create files with russian and english texts separately;
//TODO 2: Create different tests for different files;

    private Map<String, Integer> expected;
    private String text;

    public WordsCounterTest(String text, Map<String, Integer> expected){
        this.expected = expected;
        this.text = text;
    }

    @Parameterized.Parameters(name = "{index}")
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {TestDataEnglish.getWithSpecialCharacters(), TestDataEnglish.getWithSpecialCharactersResult()},
                {TestDataEnglish.getWithoutSpecialCharacters(), TestDataEnglish.getWithoutSpecialCharactersResult()},
        });
    }


    @Test
    public void getOccurrenceOfEachWord_EnglishText() {
        assertEquals(expected, WordsCounter.getOccurrenceOfEachWord(text));
    }
}