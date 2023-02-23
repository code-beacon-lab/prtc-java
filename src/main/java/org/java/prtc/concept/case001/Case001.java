package org.java.prtc.concept.case001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Case001 {

    public void fastFail() throws Exception {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (Integer number : numbers) {
            numbers.add(6);
        }
    }
}
