package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers.stream().sorted((a, b) -> b - a)
                .collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToDouble(i->(double)i)
                .average().getAsDouble();
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().max((a, b) -> a-b).get();
    }

}
