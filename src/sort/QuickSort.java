package sort;

import java.util.Arrays;
import java.util.Random;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 9:30 2019/9/4
 *@Modified By:
 */
//Java 代码实现
 public class QuickSort  {


     public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

       return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr; }

    private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
}

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] sourceArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(20);
        }
        System.out.println("sourceArray为：");
        System.out.println(Arrays.toString(sourceArray));

        System.out.println("QuickSort结果如下：");
        try {
            System.out.println(Arrays.toString(quickSort.sort(sourceArray)));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}