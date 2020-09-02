package com.schcode.review;

public class digui {

    public int jieCheng(int n) {
    if( n ==1)

    {
        return 1;
    }else

    {
        return n * jieCheng(n-1);
    }
}
}
