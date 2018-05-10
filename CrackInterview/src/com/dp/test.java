public class test {
    public void change(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String args[]){
        int[] arr = {1,1,12,2,3};
        (new test()).change(arr);
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}
