package com.example.tanveer.assignment_listview;

/**
 * Created by Tanveer on 5/21/2015.
 */
public class Datas {
    private int pic,positon;
    private String text;
    Datas(String text,int pic,int position)
    {
        this.text=text;
        this.pic=pic;
        this.positon=position;
    }
    public String getText()
    {
        return text;
    }
    public int getPic()
    {
        return pic;
    }
    public int getPositon()
    {
        return positon;
    }

}
