package com.str;

public class URLify {
    private static char[] urlify(char[] url){
        char[] newUrl = new char[url.length * 3];
        int newUrlIdx = 0;
        for (int urlIdx = 0; urlIdx < url.length; urlIdx ++){
            if (url[urlIdx] == 0x20){
                newUrl[newUrlIdx ++] = '%';
                newUrl[newUrlIdx ++] = '2';
                newUrl[newUrlIdx ++] = '0';
            }else {
                newUrl[newUrlIdx++] = url[urlIdx];
            }
        }
        return newUrl;
    }
    public static void main(String args[]){
        String url = "This is an url         need to be urlify";
        URLify u = new URLify();
        System.out.println("Original String: " + url);
        System.out.println("After Urlify: " + String.valueOf(u.urlify(url.toCharArray())));
    }
}
