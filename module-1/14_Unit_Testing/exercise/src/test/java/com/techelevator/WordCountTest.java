package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    @Test
    public void test_the_count_of_array_strings(){
        WordCount wordCount = new WordCount();

        String[] wordStrings = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("ba", 2);
        myMap.put("black", 1);
        myMap.put("sheep", 1);

        Map<String, Integer> getCount = wordCount.getCount(wordStrings);
        Assert.assertTrue(myMap.keySet().containsAll(getCount.keySet()));
    }
}
