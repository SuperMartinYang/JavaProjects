package com.str;

public class String_Compression{
    public String compressString(String s){
        char pre = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        int cnt = 0, dif = 0;
        for (char ch : s.toCharArray()){
            if (ch == pre){
                cnt ++;
            }else {
                sb.append(pre);
                sb.append(cnt);
                dif += cnt - 2;
                pre = ch;
                cnt = 1;
            }
        }
        sb.append(pre);
        sb.append(cnt);
        dif += cnt - 2;
        if (dif > 0)
            return sb.toString();
        else
            return s;
    }
    public static void main(String args[]){
        String_Compression sc = new String_Compression();
        System.out.println(sc.compressString("abcccc"));
    }
}