package com.angpe.string.services;

import org.springframework.stereotype.Service;

@Service
public class WordService {
    public static String mask(String original) {
        String[] word = original.split(" ");
        StringBuilder res= new StringBuilder();

        for (String s : word) {
            if (s.length() > 2) {
                res.append(s.charAt(0));
                res.append("*".repeat(s.length() - 2));
                res.append(s.charAt(s.length() - 1));
            } else {
                res.append(s);
            }
//            String last = word[word.length - 1];
            res.append(" ");
        }
        String mask  = res.toString();
        return mask.substring(0, mask.length()-1);
    }

}
