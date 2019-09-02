package sort;

import java.util.Arrays;
import java.util.Random;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 9:09 2019/9/2
 *@Modified By:
 */
public class sort {

    public static int[] bubbleSortTest(int[] a) {

/**
* @Author:BHR
* @Description: 冒泡法排序
* @Date:2019/9/2 19:42
*/
        int[] b = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            b[i] = a[i];
        }
        System.out.println("a:" + Arrays.toString(a));
        System.out.println(a);
        System.out.println("b" + Arrays.toString(b));
        System.out.println(b);
        System.out.println("使用冒泡法排序结果如下所示：");
        for (int i = 1; i <b.length ; i++) {
            for (int j = 0; j < b.length-1; j++) {
                if (b[j] > b[j + 1]) {
                    int tmp;
                    tmp = b[j + 1];
                    b[j + 1] = b[j];
                    b[j] = tmp;


                }

            }

        }

        System.out.println(Arrays.toString(a));
        return b;

    }

    public static int[] quickSortTest(int[] a,int left,int right) {

        if (left >= right) {
            return a;
        }

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }


        int i, j, base;
        i = left;
        j = right;
        base = b[left];
        System.out.println("a地址" + a);
        System.out.println("b地址" + b);

        while (i != j) {
            while (b[j] < base && i < j) {
                j--;
            }
            while (b[i] > base && i < j) {
                i++;
            }

            if (i < j) {
                int tmp = a[i];
                b[i]=b[j];
                b[j] = tmp;
                j--;

            }
        }

        b[left] = b[i];
        b[i] = base;
        if (left < i - 1) {
            quickSortTest(b, left, i - 1);

        }

        if (i + 1 < right) {
            quickSortTest(b, i + 1, right);
        }
//        int left, right, base;


//        for (int i = right; i >= left; i--) {
//
//            if (b[i] < b[base]) {
//                b[left] = b[i];
//                right = i;
//                for (int j = left; j < right; j++) {
//                    if (b[j] > b[base]) {
//                        b[right] = b[j];
//                        right = j;
//                    }
//                }
//
//            }

//        }

        System.out.println("原先数据如下所示：");
        System.out.println(Arrays.toString(a));
        System.out.println("QuickSort 排序的方法如下所示：");
        System.out.println(Arrays.toString(b));
        return b;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        int[] b,c = new int[20];

        for (int i = 0; i < 20; i++) {
            a[i] = random.nextInt(20);

        }
        System.out.println("原数组为：");
        System.out.println(Arrays.toString(a));


        b=bubbleSortTest(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(a);
        System.out.println(b);

        c = quickSortTest(a,0,a.length-1);

        //注意java中的数组的引用机制，数组ab都是统一对象的引用，改变其中一个，另一个的值也会随之改变。



    }
}
