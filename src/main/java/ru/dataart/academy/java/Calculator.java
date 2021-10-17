package ru.dataart.academy.java;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        int n1 = 0, n2 = 0;

        for (int i = firstNumber.size() - 1; i >= 0; i--) {
            n1 = n1 * 10 + firstNumber.get(i);
        }

        System.out.println(n1);

        for (int i = secondNumber.size() - 1; i >= 0; i--) {
            n2 = n2 * 10 + secondNumber.get(i);
        }

        System.out.println(n2);
        return n1 + n2;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        List<T> result=new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            if (i % 2 == 0) {
                result.add(list.get(i));
            }
        }
        return result;
        //Collections.EMPTY_LIST;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        List<T> result = new ArrayList<>();
        if(!list.isEmpty()) {
            result.add(list.get(0));
        }
        if (list.size() > 1)
            result.add(list.get(list.size() - 1));
        return result;
    }
}
