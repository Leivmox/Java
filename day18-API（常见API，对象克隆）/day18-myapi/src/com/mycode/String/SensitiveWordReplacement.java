package com.mycode.String;

public class SensitiveWordReplacement {
    public static void main(String[] args) {
        String word = "哈哈哈哈哈哈哈,TMD,CNM";

//        String result = word.replace("TMD", "***");
//        System.out.println(result);
        String[] arr = {"TMD", "CNM", "GDX", "FW"};
        for (int i = 0; i < arr.length; i++) {
            word = word.replace(arr[i], "***");
        }
        System.out.println(word);

    }
}
