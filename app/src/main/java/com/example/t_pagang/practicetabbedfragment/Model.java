package com.example.t_pagang.practicetabbedfragment;


public class Model {
    public static final int IMAGE_TYPE=0;

    public int type;
    public String textViewTop;
    public String textViewMessage;
    public int topIconImage;
    public int midImage1;
    public int midImage2;
    public int midImage3;

    public Model(int type, String textViewTop,String textViewMessage,int topIconImage,int midImage1,int midImage2,int midImage3)
    {
        this.type=type;
        this.textViewTop=textViewTop;
        this.textViewMessage=textViewMessage;
        this.midImage1 = midImage1;
        this.midImage2 = midImage2;
        this.midImage3 = midImage3;
        this.topIconImage = topIconImage;
    }

}
