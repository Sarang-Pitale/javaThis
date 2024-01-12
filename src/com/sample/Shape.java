package com.sample;

class Shape {
    public int l;
    public int b;

    public int area(int l, int b) {
        this.l=l;
        this.b=b;
        return l * b;
    }
}