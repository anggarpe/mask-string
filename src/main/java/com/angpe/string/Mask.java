package com.angpe.string;

public class Mask {
    public static void main(String[] args){
        String A = "Tony Stark";
        String B = "bumblebee";
        System.out.println(mask(A));
        System.out.println(mask(B));
    }

    public static String mask(String original) {
        String[] word = original.split(" ");
        String[] filter =new String[0];
        StringBuilder res= new StringBuilder();

        for (int i = 0; i < word.length ; i++) {
            if (word[i].length()>2){
                filter=word[i].split("");
                res.append(filter[0]);
                for (int j = 1; j < filter.length-1; j++) {
                        res.append("*");
                }
                res.append(filter[filter.length-1]);
            }else {
                res.append(word[i]);
            }
            res.append(" ");
        }
        return res.toString();
    }
}
