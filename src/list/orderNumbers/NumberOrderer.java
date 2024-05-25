package list.orderNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOrderer {
    List<Integer> numberList;

    public void addNumber(int number) {
        numberList.add(number);
    }

    public List<Integer> orderAsc() {
        List<Integer> asc = new ArrayList<>(numberList);

        Collections.sort(asc);

        return asc;
    }

    public List<Integer> orderDesc() {
        List<Integer> desc = new ArrayList<>(numberList);

        desc.sort(Collections.reverseOrder());

        return desc;
    }
}
