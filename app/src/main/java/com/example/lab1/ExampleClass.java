package com.example.lab1;

public class ExampleClass
{
    private int mImageResource;
    private String number;
    private int color;

    public ExampleClass(int mImageResource, String number, int color)
    {
        this.mImageResource = mImageResource;
        this.number = number;
        this.color = color;
    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getNumber(){
        return number;
    }

    public int getColor(){
        return color;
    }

}
