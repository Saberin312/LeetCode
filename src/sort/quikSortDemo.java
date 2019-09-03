package sort;

import java.util.Arrays;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 8:59 2019/9/3
 *@Modified By:
 */
public class quikSortDemo {
    public int[] sort(int[] sourceArray) throws Exception {
        //对sourceArray进行copy 不改变原Array的值
        int[] copyArray = Arrays.copyOf(sourceArray, sourceArray.length);
        return quikSortInside(copyArray, 0, copyArray.length - 1);
    }

    private int[] quikSortInside(int[] sourceArray, int left, int right) {
        if (left < right) {

        }
    }

    private int[] partition(int[] sourceArray, int left, int right) {
        //设定基准值base or pivot

        int base = left;
        int index = base + 1;
        v

    }

    private int[] swap(int[] sourceArray, int i, int j) {
        int tmp = sourceArray[i];
        sourceArray[i] = sourceArray[j];
        sourceArray[j] = tmp;
    }

}
