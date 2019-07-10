package com.ludata.luDataTest.test;

public class CartesianTest {
    // 数组
    private static String[] aa = { "红色", "蓝色", };
    private static String[] bb = { "16GB", "32GB", };
    private static String[] cc = { "中国大陆", "美国" };
    private static String[] dd = { "鹿七七", "谢长义" };

    // 二维数组
    private static String[][] lqq = { aa, bb, cc , dd};

    // 每次取二维数组的下标
    private static int[] counter = { 0, 0, 0 , 0};

    // 指针 数组的长度-1
    private static int counterIndex = lqq.length - 1;


    public static void main(String[] args) {

        for (int i = 0; i < aa.length * bb.length * cc.length*dd.length; i++) {
            System.out.print(aa[counter[0]]);
            System.out.print("\t");
            System.out.print(bb[counter[1]]);
            System.out.print("\t");
            System.out.print(cc[counter[2]]);
            System.out.print("\t");
            System.out.print(dd[counter[3]]);
            System.out.println();
            handle();
        }
    }

    public static void handle() {

        counter[counterIndex]++;
        if (counter[counterIndex] >= lqq[counterIndex].length) { //判断当前某猪
            counter[counterIndex] = 0;
            counterIndex--;
            if (counterIndex >= 0) {
                handle();
            }
            counterIndex  = lqq.length - 1;
        }
    }
}
