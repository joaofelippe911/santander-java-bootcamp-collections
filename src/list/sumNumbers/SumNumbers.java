package list.sumNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    List<Integer> numbersList;

    public SumNumbers() {
        this.numbersList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbersList.add(number);
    }

    public int sumNumbers() {
        int sum = 0;

        for (int number : numbersList) {
            sum += number;
        }

        return sum;
    }

    public int findHigherNumber() throws Exception {
        if (numbersList.isEmpty()) {
            throw new Exception("List is empty");
        }

        int number = Integer.MIN_VALUE;

        for (int n : numbersList) {
            if (n > number) {
                number = n;
            }
        }

        return number;
    }

    public int findSmallestNumber() throws Exception {
        if (numbersList.isEmpty()) {
            throw new Exception("List is empty");
        }

        int number = Integer.MAX_VALUE;

        for (int n : numbersList) {
            if (n < number) {
                number = n;
            }
        }

        return number;
    }

    public void showNumbers() {
        if (numbersList.isEmpty()) {
            System.out.println("List is empty");
        }

        System.out.println(this.numbersList);
    }
}
