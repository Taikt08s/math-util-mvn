package com.taikt08s.mathutil.main;

import com.taikt08s.mathutil.core.MathUtility;

public class Main {
    
    public static void main(String[] args) {
        //test thu ham minh vua viet co dung khong
        //chuan bi bo data test (test case)

        //Test case 1: check if factorial run well with n equal 0
        //Test procedures:
        //        Given n=0
        //        Invoke getFractorial(n=0)
        //Expected Result:1;    //0! == 1????
        long expected = 1;       //expected tra ve 1
        int n = 0;                      //neu  anh dua vao 0!
        long actual = MathUtility.getFractorial(n);     //chay ham ms biet
        //in ra va tu ket luan co giong ky vong hay khong
        System.out.println(n+"! |expected ="+expected+"|actual ="+actual);
        //Test case 1: check if factorial run well with n equal 1
        //Test procedures:
        //        Given n=1
        //        Invoke getFractorial(n=1)
        //Expected Result:1;    //1! == 1????
       
        //in ra va tu ket luan co giong ky vong hay khong
        System.out.println("1! |expected =1|actual ="+MathUtility.getFractorial(1));
        System.out.println("3! |expected =6|actual ="+MathUtility.getFractorial(3));
    }
}
