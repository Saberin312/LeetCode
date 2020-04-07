////////import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
////////
////////import java.util.*;
////////
/////////***
//////// *@Author:BHR
//////// *@Description:
//////// *@Date:Created in 10:24 2020/3/15
//////// *@Modified By:
//////// */
////////public class Solution {
////////    public boolean isPalindrome(int x) {
////////        if (x < 0 || (x != 0 && x % 10 == 0)) {
////////            return false;
////////        }
////////        int revertNumber = 0;
////////        while (x > revertNumber) {
////////            revertNumber = revertNumber * 10 + x % 10;
////////            x /= 10;
////////        }
////////        return x == revertNumber || x == revertNumber / 10;
////////    }
////////
////////    public String intoRoman(int x) {
////////        /*
////////         * @Author:BHR
////////         * @Description: leetcode 12 采用hashmap
////////         * @Date:2020/3/16 13:37
////////         */
////////        String string = "01dfadfa11";
////////        return string;
////////
////////    }
////////
////////    public String intToRoman(int num) {
////////        // 把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中
////////        // 并且按照阿拉伯数字的大小降序排列，这是贪心选择思想
////////        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
////////        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
////////        HashMap hashMap = new HashMap();
////////        hashMap.put(1000, "M");
////////
////////        StringBuilder stringBuilder = new StringBuilder();
////////        int index = 0;
////////        while (index < 13) {
////////            // 特别注意：这里是等号
////////            while (num >= nums[index]) {
////////                // 注意：这里是等于号，表示尽量使用大的"面值"
////////                stringBuilder.append(romans[index]);
////////                num -= nums[index];
////////            }
////////            index++;
////////        }
////////        return stringBuilder.toString();
////////    }
////////
////////    //    public int RomantoInt(String string) {
//////////        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//////////        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//////////        HashMap<String, Integer> hashMap = new HashMap<>();
//////////        for (int i = 0; i < romans.length; i++) {
//////////            hashMap.put(romans[i], nums[i]);
//////////        }
//////////
//////////        int res = 0;
////////////        while (string != null) {
////////////
////////////        }
//////////        if (string == null) {
//////////            return 0;
//////////        }
//////////        for (int i = 0; i < string.length(); i++) {
//////////
//////////            if (hashMap.containsKey(string.charAt(i))) {
//////////                res =res+ hashMap.get(string.charAt(i));
//////////                System.out.println(hashMap.get(string.charAt(i)));
//////////
//////////            }
//////////        }
//////////        return res;
////////    public int romanToInt(String s) {
////////        int sum = 0;
////////        int preNum = getValue(s.charAt(0));
////////        for (int i = 1; i < s.length(); i++) {
////////            int num = getValue(s.charAt(i));
////////            if (preNum < num) {
////////                sum -= preNum;
////////            } else {
////////                sum += preNum;
////////            }
////////            preNum = num;
////////        }
////////        sum += preNum;
////////        return sum;
////////    }
////////
////////
////////    private int getValue(char ch) {
////////        switch (ch) {
////////            case 'I':
////////                return 1;
////////            case 'V':
////////                return 5;
////////            case 'X':
////////                return 10;
////////            case 'L':
////////                return 50;
////////            case 'C':
////////                return 100;
////////            case 'D':
////////                return 500;
////////            case 'M':
////////                return 1000;
////////            default:
////////                return 0;
////////        }
////////    }
////////
//////////    public String longestCommomPrefix(String[] string) {
//////////        String res = "";
//////////        if (string.length <= 1) {
//////////            return "";
//////////        }
//////////        int s = 0;
//////////        for (int i = 1; i < string.length; i++) {
//////////
////////////            tmp = string[i].length();
//////////            if (string[s].length() < string[i].length()) {
//////////                s = i;
//////////            }
//////////        }
//////////        int i = 0;
//////////        while ( i < string[s].length()) {
//////////            int j = 0;
//////////            for (; j < string[j].length() && j < string[s].length(); j++) {
//////////                if (string[j].charAt(i) != string[s].charAt(i)) {
//////////                    break;
//////////                }
//////////                i++;
//////////
//////////            }
//////////        }
//////////            return string[s].substring(0, i);
//////////
//////////
//////////    }
////////
////////    public String longestCommonPrefix(String[] strs) {
////////
////////        if (strs.length == 0)
////////            return "";
////////        String ans = strs[0];
////////        for (int i = 1; i < strs.length; i++) {
////////            int j = 0;
////////            for (; j < ans.length() && j < strs[i].length(); j++) {
////////                if (ans.charAt(j) != strs[i].charAt(j))
////////                    break;
////////            }
////////            ans = ans.substring(0, j);
////////            if (ans.equals(""))
////////                return ans;
////////        }
////////        return ans;
////////    }
////////
////////    public List<List<Integer>> threeSum(int[] nums) {
//////////        List<List<Integer>> lists = new ArrayList<>();
//////////        for (int i = 0; i < nums.length; i++) {
//////////            for (int j = 1; j < nums.length; j++) {
//////////                for (int k = 2; k < nums.length; k++) {
////////////                    nums[i]+nums[j]+nums[k]
//////////                }
//////////            }
//////////        }
//////////        int i = 0, j = 1, k = 2;
//////////        while (i < nums.length) {
//////////            while (j < nums.length) {
//////////                while (k < nums.length) {
//////////                    if (nums[i] + nums[j] + nums[k] == 0) {
//////////                        List<Integer> list = new ArrayList();
//////////                        list.add(i);
//////////                        list.add(j);
//////////                        list.add(k);
//////////                        lists.add(list);
//////////
//////////            }
//////////        }
//////////    }}
//////////        return lists;
////////        List<List<Integer>> ans = new ArrayList();
////////        int len = nums.length;
////////        if(nums == null || len < 3) return ans;
////////        Arrays.sort(nums); // 排序
////////        for (int i = 0; i < len ; i++) {
////////            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
////////            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
////////            int L = i+1;
////////            int R = len-1;
////////            while(L < R){
////////                int sum = nums[i] + nums[L] + nums[R];
////////                if(sum == 0){
////////                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
////////                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
////////                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
////////                    L++;
////////                    R--;
////////                }
////////                else if (sum < 0) L++;
////////                else if (sum > 0) R--;
////////            }
////////        }
////////        return ans;
////////
////////    }
////////
////////    //    public int threeSumClosest(int[] nums, int target) {
//////////        if (nums.length < 3 || nums == null) throw Exception
//////////        Arrays.sort(nums);
//////////
//////////    }
//////////    public List<String> letterCombinations(String digits) {
//////////        String[] strings = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//////////        List<String> list = new ArrayList<>();
//////////        for (int i = 0; i < digits.length(); i++) {
//////////            for (int j = 0; j < strings[i].length(); j++) {
//////////                list.add(String.valueOf(strings[i].charAt(j)));
//////////            }
//////////        }
//////////
//////////
//////////    }
////////
////////    public int[] sum2(int[] nums, int target) {
////////        if (nums.length < 2 || nums == null) {
////////            return null;
////////        }
////////        int[] res;
////////        int i = 0, j = nums.length;
////////        Arrays.sort(nums);
////////
////////            if (nums[0] > target || nums[nums.length - 1] < target) {
////////                return null;
////////            }
////////        while (i < j) {
////////            if (nums[i] + nums[j] == target) {
////////                return new int[]{i, j};
////////            } else if (nums[i] + nums[j] > target) {
////////
////////                j--;
////////            } else if (nums[i] + nums[j] < target) {
////////                i++;
////////            }
////////        }
////////        return null;
////////    }
////////
//////////        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//////////
//////////
//////////        }
////////
////////    int ans=0;
////////    int[][] d={{0,1},{1,0},{-1,0},{0,-1}};
////////    public int movingCount(int threshold, int rows, int cols)
////////    {
////////
////////        if(threshold<(rows+cols))return rows*cols;
////////        boolean[][] visit=new boolean[rows][cols];
////////        backtrack(threshold, rows, cols, 0,0,visit);
////////        return ans;
////////
////////    }
////////    private void backtrack(int threshold, int rows, int cols,int x, int y,boolean[][] visit){
////////        visit[x][y]= true;
////////        if(sumt(x)+sumt(y)>threshold)return;
////////        else{
////////            ans++;
////////            for(int i=0;i<4;i++){
////////                x=x+d[i][0];
////////                y=y+d[i][1];
////////                if(x>=0&&x<=rows&&y>=0&&y<=cols&&visit[x][y]!= true){
////////                    backtrack(threshold, rows, cols, x, y,visit);
////////                }
////////            }
////////        }
////////    }
////////    private int sumt(int x){
////////        int tmp=0;
////////        while(x>=0){
////////            int mod=x%10;
////////            tmp=tmp+mod;
////////            x=x/10;
////////        }
////////        return tmp;
////////    }
////////
////////
////////
////////    public static void main(String[] args) {
////////        String string1 = "MMM";
////////        Solution solution = new Solution();
////////        int a = solution.romanToInt(string1);
////////        System.out.println(a);
////////        System.out.println(solution.romanToInt(string1));
////////        System.out.println(string1.charAt(0));
////////
////////        System.out.println("整数字符串互转："+1);
////////        /*
////////        * @Author:BHR
////////        * @Description: 阿里笔试突击
////////        * @Date:2020/3/21 9:02
////////        */
//////////        Scanner sc = new Scanner(System.in);
//////////        if (sc.hasNext()) {
//////////            System.out.println(sc.nextInt());
//////////
//////////        }
////////        String[][] strings = new String[5][5];
////////        System.out.println(strings);
////////        StringBuilder str = new StringBuilder();
////////        for (int i = 0; i < 5; i++) {
////////            str.append('.');
////////
////////        }
////////        List<String> list = new ArrayList<String>();
////////        for (int i = 0; i < 5; i++) {
////////            list.add(str.toString());
////////        }
////////        System.out.println(list);
////////    }
////////
////////}
//////public class Solution {
//////    int ans=0;
//////    int[][] d={{0,1},{1,0},{-1,0},{0,-1}};
//////    public int movingCount(int threshold, int rows, int cols)
//////    {
//////
//////
//////        if (threshold < 0 || rows <= 0 || cols <= 0) {
//////            return 0;
//////        }
//////        boolean[][] vis = new boolean[rows][cols];
//////        backtrack(threshold, rows, cols, 0, 0, vis);
//////        return ans;
//////    }
//////
//////
//////    private void backtrack(int threshold, int rows, int cols,int x, int y,boolean[][] visit){
//////
//////        if(sumt(x)+sumt(y)>threshold)return;
//////        else{
//////            ans++;
//////            visit[x][y] = true;
//////            for(int i=0;i<4;i++){
//////
//////                int newx=x+d[i][0];
//////                int newy=y+d[i][1];
//////                if(newx>=0&&newx<rows&&newy>=0&&newy<cols&&visit[newx][newy]!= true){
//////                    backtrack(threshold, rows, cols, newx, newy,visit);
//////                }
//////            }
////////            ans--;
////////            visit[x][y] = false;
//////        }
//////    }
//////    private int sumt(int x){
//////        int tmp=0;
//////        while(x>0){
//////            int mod=x%10;
//////            tmp=tmp+mod;
//////            x=x/10;
//////        }
//////        return tmp;
//////    }
//////
//////    public static void main(String[] args) {
//////        Solution solution = new Solution();
//////        solution.movingCount(1, 2, 2);
//////    }
//////}
////public class Solution {
////    public int cutRope(int target) {
////        if(target<2)return 0;
////        if(target==2)return 1;
////        if(target==3)return 2;
////        return cutRopeCore(target,0);
////
////    }
////    private int cutRopeCore(int target,int num){
////        if(target<2)return 0;
////        if(target==2)return 1;
////        if(target==3)return 2;
////        int ans=num;
////        for(int i=1;i<target/2+1;i++){
////            ans=Math.max(cutRopeCore(target-i,target-i)*cutRopeCore(i,i),ans);
////
////        }
////        return ans;
////    }
////
////    public static void main(String[] args) {
////        Solution solution = new Solution();
////        solution.cutRope(4);
////    }
////}
//
//import java.util.ArrayList;
//public class Solution {
//    public ArrayList<Integer> lists=new ArrayList<>();
//    public ArrayList<Integer> printMatrix(int [][] matrix) {
//        if(matrix.length==1){
//            lists.add(matrix[0][0]);
//            return lists;
//        }
//        for(int i=0;i<matrix[0].length;i++){
//            lists.add(matrix[0][i]);
//            System.out.println(matrix[0][i]);
//        }
//
//            printMatrix(transf(matrix));
//
//        return lists;
//
//    }
//
//    private int[][] transf(int[][] matrix){
//        int m=matrix.length;
//        int n=matrix[0].length;
////        if(m==1&&n==1){
////            return new int[][] res={{1}};}
//
//        int[][] newMat=new int[n][m-1];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m-1;j++){
//                newMat[i][j]=matrix[j+1][n-1-i];
//            }
//        }
//        System.out.println(newMat[0]);
////        System.out.println();
//        return newMat;
//
//
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        int[][] matrix = {{1, 2}, {3, 4},{5,6}};
//        int[][] matrix = {{1},{2},{3},{4},{5}};
//        System.out.println(matrix.length);
////        solution.printMatrix(matrix);
//        int[][] mat=solution.transf(matrix);
////        System.out.println(solution.transf(matrix));
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[0].length; j++) {
//                System.out.println("i="+i);
//                System.out.println("j="+j);
//                System.out.println(mat[i][j]);
//            }
//        }
//    }
//
//}

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        /**
        * @Author:BHR
        * @Description: 剑指offer 和为S 的连续正整数；
        * @Date:2020/3/21 21:51
        */
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<sum;i++){
            ArrayList<Integer> list=new ArrayList<Integer>();
            boolean[] visit=new boolean[sum-1];

            backTrack(list,sum,0,i,visit);
        }
        return lists;
    }
    private void backTrack(ArrayList<Integer> list,int sum,int sumTmp,int k,boolean[] visit){
        if(sumTmp+k==sum){
            list.add(k);
            lists.add(list);
            return;
        }


        if(sumTmp+k<sum&&visit[k-1]!=true){
            visit[k-1]=true;
            list.add(k);
            int newSumTmp=sumTmp+k;
            int newk=k+1;
            backTrack(list,sum,newSumTmp,newk,visit);
        }


    }

    public ArrayList<ArrayList<Integer>> findSequence(int target) {
        ArrayList<Integer> list = new ArrayList<>();
//        boolean[] visit=new boolean[target];
        for (int i = 1; i <target/2+1 ; i++) {


        backTrack2(list,target,0,i);}
        return lists;
    }
    private void backTrack2(ArrayList<Integer> list,int target,int sum,int k) {
        if (sum+k == target) {
            list.add(k);
            lists.add(new ArrayList<>(list));
//            visit[k] = false;
            list.remove(new Integer(k));
            return;

        }
//        lists.add(list);
//        list.add(k);
        if (sum +k < target ) {
//            visit[k] = true;
            list.add(k);
            int newSum = sum + k;
            for (int i = k+1 ; i <= target; i++) {


                int newk = i;
                backTrack2(list, target, newSum, newk);

            }
            list.remove(new Integer(k));
//            visit[k]=false;
//            list.remove(new Integer(k));
//            return;
//            list.add(k);

        }
//        visit[k] = true;
//        list.add(k);
//        if (sum+k==target) {
//            lists.add(new ArrayList<>(list));
//            list.remove(new Integer(k));
//        }
    }
    public boolean isContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int count=0;
        int cnt=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                count++;
            }
        }
        for(int i=count;i<numbers.length-1;i++){
            if(numbers[i+1]-numbers[i]>1){
                cnt=cnt+numbers[i+1]-numbers[i]-1;

            }
            else if(numbers[i+1]-numbers[i]==0){
                return false;}
        }


        if(count>=cnt){return true;}
        return false;
    }

    public int StrToInt(String str) {

        if((str.length()<=0))return 0;

        boolean neg=false;
        if(str.charAt(0)=='-'){
            neg=true;
            str=str.substring(1);
        }else if(str.charAt(0)=='+'){
            str=str.substring(1);
        }
        char[] chs=str.toCharArray();
        if((chs.length<=0)||(chs.length==1&&chs[0]=='0'))return 0;
        int res=0;
        for(int i=0;i<chs.length;i++){
            if(!isNum(chs[i]))return 0;
            int tmp=chs[i]-'0';
            res=res*10+tmp;
        }
        return res;
    }
    private boolean isNum(char ch){
        if(ch<='9'&&ch>='0')return true;
        else return false;
    }

    public static int dfs(int[] arr, int num) {
        int sum=0;
        if (num<=5 && arr[num]>=1 && arr[num+1]>=1 && arr[num+2]>=1 && arr[num+3]>=1 && arr[num+4]>=1) {
            arr[num]--;
            arr[num+1]--;
            arr[num+2]--;
            arr[num+3]--;
            arr[num+4]--;
            sum++;
        }
        if (num<=7 && arr[num]>=2 && arr[num+1]>=2 && arr[num+2]>=2) {
            arr[num] -=2;
            arr[num+1] -=2;
            arr[num+2] -=2;
            sum++;
        }
        if (arr[num]>=2) {
            arr[num] -=2;
            sum++;
        }
        if (arr[num]==1) {
            arr[num]--;
            sum++;
        }
        if (num<=8) {
            sum = sum+dfs(arr, num+1);
        }

        return sum;
    }
    public int uniquePaths(int m, int n) {
        return backTrack(0,0,0,m,n);

    }
    private int backTrack(int count,int x,int y,int m,int n){
        if(x==m-1&&y==n-1){
            count=count+1;
            return count;
        }
        while(x+1<=m-1){return backTrack(count,x+1,y,m,n);}
        while(y+1<=n-1){return backTrack(count,x,y+1,m,n);}
        return count;
    }

    public void reOrderArray(int [] array) {
        int l=array.length;

        if(l<=2)return;
        int half=l/2;
        int[] copy=new int[l];
        if(l%2==1) {
            for (int i = 0; i < half + 1; i++) {

                copy[i] = array[i * 2];
                if (i * 2 + 1 < l) {
                    copy[i + half + 1] = array[i * 2 + 1];
                }
            }
        } else {
            for (int i = 0; i < half ; i++) {

                copy[i] = array[i * 2];
                if (i * 2 + 1 < l) {
                    copy[i + half ] = array[i * 2 + 1];
                }
            }
        }

        for(int i=0;i<l;i++){
            array[i]=copy[i];
        }
        return;
    }

    public void matrixCheck(int[][] mat,int n,int m) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                int count = 0;
                int star=-1;
                int end=-1;
                if (mat[i][j] != 0) {
                    count++;
                    if (star==-1&&end==-1){
                        star = j;
                    } else if (star != -1 && end == -1) {
                        end = j;
                    }

                }
                if (count >= 2) {
                    rowCheck(mat, n, m,i,star,end);

                }
            }
        }
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                int count = 0;
                int star=-1;
                int end=-1;
                if (mat[j][i] != 0) {
                    count++;
                    if (star==-1&&end==-1){
                        star = j;
                    } else if (star != -1 && end == -1) {
                        end = j;
                    }

                }
                if (count >= 2) {
                    colCheck(mat, n, m,i,star,end);

                }
            }
        }
    }

    public void rowCheck(int[][] mat,int n,int m,int i,int start,int end){
        int d=mat[i][start]-mat[i][end];
        d=d/(end-start);
        for (int j = 0; j < m; j++) {
            mat[i][j]=mat[i][start]+d*(j-start);
        }
    }
    public void colCheck(int[][] mat,int n,int m,int i,int start,int end){
        int d=mat[start][i]-mat[end][i];
        d=d/(end-start);
        for (int j = 0; j < m; j++) {
            mat[j][i]=mat[start][i]+d*(j-start);
        }
    }
    public boolean wordBreak3(String s, Set<String> dict) {
        int i,j;
        boolean ans[]=new boolean[s.length()+1];
        ans[0]=true;
        for(i=1;i<ans.length;i++){
            for(j=0;j<i;j++){
                if(ans[j]&&dict.contains(s.substring(j,i))){
                    ans[i]=true;
                    break;
                }
            }
        }
        return ans[ans.length-1];
    }


    public boolean wordBreak2(String s, Set<String> dict) {
        int i,j;
        boolean array[]=new boolean[s.length()+1];//此处的Array大小
        array[0]=true;//此处的初始化
        for(i=1;i<array.length;i++) {
            for(j=0;j<i;j++) {
                if(array[j]&&dict.contains(s.substring(j, i))) {
                    array[i]=true;//此处的SubString
                    break;
                }
            }
        }
        return array[array.length-1];//此处的返回值

    }


    public ArrayList<String> wordBreak(String s, Set<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, ArrayList<String>>());
    }

    private ArrayList<String> DFS(String s, Set<String> wordDict, HashMap<String, ArrayList<String>> map) {
        if (map.containsKey(s))
            return map.get(s);
        ArrayList<String> res = new ArrayList<String>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String subStr : wordDict) {
            if (s.startsWith(subStr)) {
                for (String str : DFS(s.substring(subStr.length()), wordDict, map)) {
                    res.add(subStr + (str == "" ? "" : " ") + str);

                }

            }
        }
        map.put(s, res);
        return res;
    }


    public ArrayList<String> dp(String s,Set<String> dict){
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
        ArrayList<String> list=new ArrayList();
        list.add("");
        int len=s.length();
        // String emp="";
        map.put("",list);
        for(int i=len-1;i>=0;i--){
            String cur=s.substring(i,len);
            int len2=cur.length();
            ArrayList<String> lists=new ArrayList();
            for(int j=1;j<=cur.length();j++){

                String sub=cur.substring(0,j);
                if(dict.contains(sub)){
                    ArrayList t=(ArrayList<String>) map.get(cur.substring(j,len2));
                    if(t.size()==0){
                        continue;
                    }else{
                        for(int p=0;p<t.size();p++){
                            StringBuilder sb=new StringBuilder();
                            sb.append(sub).append(" ").append(t.get(p));
                            lists.add(sb.toString().trim());
                        }
                    }
                }
            }
            map.put(cur,lists);
        }
        return (ArrayList)map.get(s);
    }
    public int singleNumber(int[] A) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<A.length;i++){
            if (!map.containsKey(A[i])) {

                map.put(A[i], 1);
            } else {
                map.put(A[i], 2);
            }

        }
        int res=0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                res= key;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.FindContinuousSequence(2);
//        solution.findSequence(5);
//        ArrayList<ArrayList<Integer>> lists2 = new ArrayList<ArrayList<Integer>>();
//        lists2 = solution.findSequence(9);
//        System.out.println(lists.size());
//        int[] a=lists.toArray(new Integer[lists.size()]);
//        String str= lists2.toString();
//        System.out.println(str);

//        for (ArrayList<Integer> list : lists2) {
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
//        }
        int[] nums = {0, 3, 2, 6, 4};
        System.out.println(solution.isContinuous(nums));
        String tst = "4124124";
        System.out.println(solution.StrToInt(tst));

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println("-1:"+arr[-1]);
//        solution.reOrderArray(arr);
//        System.out.println(Arrays.toString(arr));
//        int result = dfs(arr, 0);
//        System.out.println(result);

//        System.out.println(solution.uniquePaths(3,2));
//        int n = 34;
//        int ans = 0;
////        return ans=n*(2**(n-1))%(10**9+7);
//        ans = (int) Math.pow(2, n - 1);
//        int tmp = (int) Math.pow(10, 9) + 7;
//        ans = ans % tmp;
////        ans=(int)Math.pow(2,n-1)%(Math.pow(10,9)+7);
//        System.out.println(ans);
//        int[][] mat = {{1, 2, 3}, {4, 5, 0}};
//        for (int i = 0; i < 2; i++) {
//
//
//            System.out.println(Arrays.toString(mat[i]));
//            System.out.println(mat.length);
//        }
//        Scanner sc = new Scanner(System.in);
//        int N = 0;
//        int K = 0;
////        while (sc.hasNext()) {
//        N = sc.nextInt();
//        K = sc.nextInt();
//        System.out.println(N);
//        System.out.println(K);
////        }
//        int[][] sum = new int[K + 1][N];
////        while (sc.hasNext()){
//        for (int i = 0; i < N; i++) {
//            sum[0][i] = sc.nextInt();
//            System.out.println(sum[0][i]);
////            for (int j   = 0; j < 2; j++) {
////                sum[i][j] = sc.nextInt();
////            }
//        }
////        }}
//        for (int i = 0; i < K + 1; i++) {
//            sum[i][0] = sum[0][0];
//        }
//
//        for (int i = 1; i < K + 1; i++) {
//
//            for (int j = 1; j < N; j++) {
//                sum[i][j] = sum[i][j - 1] + sum[i - 1][j];
//            }
//        }
//        System.out.println(sum[K][N - 1]);
        StringBuffer stringBuffer = new StringBuffer("StringBuffer test:");
        System.out.println(stringBuffer);
        stringBuffer.replace(1, 2, "replace");
        System.out.println(stringBuffer);
    }

    final static int M=1000000007;
    private static long fastPow2(int n){
        if(n==0) return 1;
        if(n==1) return 2;
        long ans=1;
        long base=2;
        while(n!=0){
            if((n&1)==1) ans=((ans%M)*(base%M))%M;
            base=((base%M)*(base%M))%M;
            n>>=1;
        }
        return ans%M;
    }
    //n*2^(n-1) % 1000000007
    private static int func1(int n){
        return (int) (((n%M)*(fastPow2(n-1)%M))%M);
    }




//        for (int i = 0; i <N ; i++) {
//
//
//            System.out.println(Arrays.toString(sum[i]));
//        }
//    }

//    private static Singleton ins
}