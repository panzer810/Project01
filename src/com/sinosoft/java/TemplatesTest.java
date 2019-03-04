package com.sinosoft.java;

import java.util.ArrayList;

/**
 * @author liuqian
 * @create 2019-03-04 9:22
 *
 * 常用的模板
 */
public class TemplatesTest {

    //模板六：prsf
    private static final int NUM = 1;

    //变形：psf
    public static final String str = "psf";
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!");
        //变形：sountp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        method();

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);

        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String s : list) {
            
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    public static void method(){
        System.out.println("TemplatesTest.method");

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
