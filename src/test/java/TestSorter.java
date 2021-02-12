import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSorter {

    @Test
    public void test_sortOnSimpleArray() {
        int[] tab = new int[] {4, 3, 2, 1, 5, 6};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        assert Arrays.equals(Sorter.sortArray(tab, 5), expected);

        tab = new int[] {4, 3, 2, 1, 7, 5, 6};
        expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        assert Arrays.equals(Sorter.sortArray(tab, 5), expected);
    }

    @Test
    public void test_fusion() {
        int[] a = new int[] {1, 2};
        int[] b = new int[] {3, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assert Arrays.equals(Sorter.arraysFusion(a, b), expected);
    }

    @Test
    public void test_leftShift() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[]{2, 3, 4, 5};
        assert Arrays.equals(Sorter.leftShift(array), expected);
    }

    @Test
    public void test_arrayConcatenation() {
        int[] array = new int[] {2, 3, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assert Arrays.equals(Sorter.concatenate(1, array), expected);
    }

    @Test
    public void test_arrayCut() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] expected1 = new int[]{1, 2, 3};
        int[] expected2 = new int[]{4, 5};
        Tuple2<int[], int []> result = Sorter.cutArray(array);
        assert Arrays.equals(result._1(), expected1);
        assert Arrays.equals(result._2(), expected2);

        array = new int[] {1, 2, 3, 4};
        expected1 = new int[]{1, 2};
        expected2 = new int[]{3, 4};
        result = Sorter.cutArray(array);
        System.out.println(result);
        assert Arrays.equals(result._1(), expected1);
        assert Arrays.equals(result._2(), expected2);
    }

}
