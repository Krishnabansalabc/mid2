package main;

import java.util.Date;

public class Array_basic {
    public static void main(String[] args) {
        /*int a[] = new int[10];
        for (int i = 0; i <10; i++) {
            a[i] = i*i;
        }
        for (int b:a)
        {
            System.out.println(b);
        }*/
        Date[] date = new Date[10];
        for (int i = 0; i < date.length; i++) {
            date[i] = new Date(2005-1900,11,i+1);
        }
        for (Date date1 : date) {
            System.out.println(date1);
        }


    }
}
