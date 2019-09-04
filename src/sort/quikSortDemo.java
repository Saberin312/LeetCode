package sort;

import java.util.Arrays;
import java.util.Random;

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
            int partitioinIndex=partition(sourceArray, left, right);
            quikSortInside(sourceArray, left, partitioinIndex - 1);
            quikSortInside(sourceArray, partitioinIndex + 1, right);

        }
        return sourceArray;
    }

    private int  partition(int[] sourceArray, int left, int right) {
        //设定基准值base or pivot

        int base = left;
        int index = base + 1;
        for (int i = index; i < right; i++) {
            if (sourceArray[i] < sourceArray[base]) {
                swap(sourceArray, i, index);
                index++;

            }
        }
        swap(sourceArray, base, index - 1);
        return index-1;

        }


    private void swap(int[] sourceArray, int i, int j) {
        int tmp = sourceArray[i];
        sourceArray[i] = sourceArray[j];
        sourceArray[j] = tmp;
//        return sourceArray;
    }

    public static void main(String[] args) {
        quikSortDemo quikSortDemo1 = new quikSortDemo();
        int[] sourceArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(20);
        }
        System.out.println("surceArray为：");
        System.out.println(Arrays.toString(sourceArray));

        try {
            quikSortDemo1.sort(sourceArray);
            System.out.println(Arrays.toString(quikSortDemo1.sort(sourceArray)));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
