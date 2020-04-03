package comp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:12 2020/3/9
 *@Modified By:
 */
public class floatComp {
    private void compareByOperator() {
        /**
         * @Author:BHR
         * @Description: 浮点数比较不可直接==
         * @Date:2020/3/9 13:12
         */
        float f1 = 0.0f;
        for (int i = 0; i < 11; i++) {
            f1 += 0.1f;

        }

        float f2 = 0.1f*11;
        System.out.println("f1==:" + f1);
        System.out.println("f2==:" + f2);
//        f2=f2*
//        for (int i = 0; i < 11; i++) {
//        }
    }

    public static void main(String[] args) {
        floatComp fc = new floatComp();
        fc.compareByOperator();

    }

}
