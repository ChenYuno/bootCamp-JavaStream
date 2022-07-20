package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0,(before, behind) -> {
            return behind % 2 != 0 ? behind : before;
        });
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce("",(w1,w2)->w2.length() > w1.length()?w2:w1);
    }

    public int getTotalLength(List<String> words) {
        return words.stream().mapToInt(String::length)
                .reduce(0, Integer::sum);
    }
}
