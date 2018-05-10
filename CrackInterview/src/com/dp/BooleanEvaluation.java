package com.dp;

public class BooleanEvaluation {
    public static int solver(String boolstr, boolean pp){
        int res = 0;
        if (boolstr.length() == 1){
            if (boolstr.charAt(0) == '1'){
                if (pp)
                    return 1;
                return 0;
            }
            return 0;
        }
        if (boolstr.length() == 3){
            if (eval(boolstr.charAt(0) == '1', boolstr.charAt(2) == '1', boolstr.charAt(1), pp)){
                if (pp)
                    return 1;
            }
            return 0;
        }
        for (int i = 1; i < boolstr.length() - 1; i += 2) {
            int left = solver(boolstr.substring(0, i), pp);
            int left_fl = solver(boolstr.substring(0, i), !pp);
            int right = solver(boolstr.substring(i + 1, boolstr.length()), pp);
            int right_fl = solver(boolstr.substring(i + 1, boolstr.length()), !pp);
            if (eval(left != 0, right != 0, boolstr.charAt(i), pp)){

            }
        }
        return res;
    }
    public static boolean eval(boolean b1, boolean b2, char op, boolean pp){
        if (op == '|')
            return b1 | b2;
        else if (op == '&')
            return b1 & b2;
        else if (op == '^')
            return b1 ^ b2;
        return true;
    }
    public static void main(String[] args){
        String boolstr = "1&1|0";
        System.out.println(solver(boolstr, true));
    }
}
