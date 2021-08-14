package com.datastructures.sort.bubblesort;

import com.datastructures.sort.BubbleSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void sortBubbleTest(){
        int [] elements = {18,25,-15,5, 55, 60, -1,43};
        int [] result = BubbleSort.sort(elements);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(elements, result);
    }
}


