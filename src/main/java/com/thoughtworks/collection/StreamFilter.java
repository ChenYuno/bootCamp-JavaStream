package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream().filter((num)->{
            return num%2==0;
        }).collect(Collectors.toList());
    }

    public List<String> filterEndWithS(List<String> words) {
        return words.stream().filter(w->{
            String regex = ".*s$";
            return w.matches(regex);
        }).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return numbers.stream().filter(num->anotherNumbers.contains(num))
                .collect(Collectors.toList());
    }


}
