package com.taikt08s.mathutil.core;

//bo thu vien dung trong tinh toan toan hoc
//clone giong math ben jdk
//khi goi la thu vien dung chung ma khong can nho nhung
//gi sau khi xu li thi do laf thu vien chua static
public class MathUtility {

    public static final double PI = 3.14159;
    //ham tinh n!=1,2,3,...n
    //n<0 n>20 ko tinh 21! do tran kieu long
    //ko tinh giai thua am
    //0!=1!=1

    public static long getFractorial(int n) {
        long result = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n.n must be between 0 and 20");

        }
        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
