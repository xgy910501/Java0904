package com.xue.test;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/4.
 */
public class WhileXunHuan {

    /***
     * While循环
     */
    public static void main (String[] args){
        //多少遍
        int i=1;
        while (i<=10){
            System.out.println("第"+i+"遍，好好学习，天天向上");
            i++;
        }

        //10以内能被三整除的数的和
        int n=1;
        int sum=0;
        while (n<=10){
            if(n%3 == 0){
                sum =sum+n;
            }
            n++;
        }
        System.out.print("sum="+sum);

        //询问式,控制台输入，人机交互
        Scanner input = new Scanner(System.in);
        String ans = "不合格";

        while ("不合格".equals(ans) || "no".equals(ans)){
            System.out.println("不合格，上午。。下午。。");
            System.out.println("合格了吗？");
            ans = input.next();
        }

        System.out.println("合格了");

    }
}
