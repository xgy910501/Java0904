package com.xue.test;

/**
 * Created by Administrator on 2016/9/4.
 */
public class ForXunHuan {

    /***
     * For循环,练习题
     */
    public static void main (String[] args){
        /*for(int i=0;i<=10;i++){
            System.out.println("第"+i+"遍，好好学习，天天向上");
        }*/

    //习题
    //1.猴子吃桃:摘桃若干，第一天吃一半加一个，之后每天吃前一天剩下的一半加一个，第十天还有一个，一共多少桃？
        /*int tnum = 1;
        for(int i=1;i<10;i++){
            tnum = (tnum+1)*2;
        }
        System.out.println("tnum="+tnum);*/
     //2.兔子问题，斐波纳锲数列
       /* int n1=1,n2=1,n3=0;
        for(int i=3;i<=12;i++){
            n3=n2+n1;
            n1=n2;
            n2=n3;
        }
        System.out.println("n3="+n3);*/
     //3.99乘法表
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
