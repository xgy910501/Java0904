package com.xue.test;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/4.
 */
public class DoWhileXunHuan {

    /***
     * DoWhile循环
     */
    public static void main (String[] args){
        /*Scanner input = new Scanner(System.in);
        String ans="";
        do{
            System.out.println("编程。。。");
            System.out.println("合格吗？");
            ans = input.next();
        }while("不合格".equals(ans) || "no".equals(ans));

        System.out.println("合格了！");*/
        //温度变化
       /* double SheShi =0,HuaShi = 0;
        int num = 1;
        System.out.println("序号\t摄氏温度\t华氏温度");
        do{
            HuaShi=SheShi*9/5.0+32;
            System.out.println(num+"\t"+SheShi+"\t\t"+HuaShi);
            SheShi+=20;
            num++;
        }while(SheShi<=250 && num<=10);*/

        //直角三角形
        /*int rows = 5;
        int num = 0;
        while (num<=rows){
            int cols=0;
            while(cols<=num){
                System.out.print("*");
                cols++;
            }
            num++;
            System.out.println();
        }*/

        /*int rows = 5;
        int num = 0;
        while (num<=rows){
            int cols = 0;
            while(cols <=num){
                System.out.print("\t*");
                cols++;
            }
            num++;
            System.out.println();
        }*/

        int row = 5;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
