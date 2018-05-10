public class String_isUnique {
    public boolean isUnique(String s){
        int[] bitmap = new int[8];
        for (char c : s.toCharArray()){
            int index = c / 32;
            int bit = 0x1 << (c % 32);
            if ((bitmap[index] & bit) == bit){
                return false;
            }
            bitmap[index] |= bit;
        }
        return true;
    }
    public static void main(String[] args) {
        String_isUnique su = new String_isUnique();
        System.out.println("Whether String is Unique? " + su.isUnique("abcdef"));
    }
}
