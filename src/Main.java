import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Stick implements Comparable {
    int l;
    int w;

    public Stick(int l, int w) {
        this.l=l;
        this.w = w;

    }


    public int compareTo(Object o) {
        Stick stick = (Stick) o;
        if (stick.l == this.l) {
            return stick.w - this.w;
        } else {
            return stick.l - stick.l;
        }
    }

}
public class Main {
    static final  int maxn=5050;
    static Stick[] sticks;
    static int n;
    static int[] d = new int[maxn];
    static int m=0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int k = 0; k <N ; k++) {


            n = sc.nextInt();

            Stick[] sticks = new Stick[n];
            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();
                int y = sc.nextInt();
                sticks[i] = new Stick(x, y);
            }
            Arrays.sort(sticks);
            for (int i = 0; i < n; i++) {
                if (d[m] < sticks[i].w) {
                    d[++m] = sticks[i].w;
                } else {
                    d[lowerBounder(d, 1, m + 1, sticks[i].w)] = sticks[i].w;
                }
            }
            System.out.println(m);
        }
    }

    public static int lowerBounder(int[] a, int l, int r, int key) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] >= key) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
