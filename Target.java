package Programs;

public class Target {
    public static void main(String[] args){
        int tar = 2;
        int[] arr ={1,3,2,4,5,2,7,6};
        int[] arr1 =new int[arr.length];
        int ind = 0;
        for(int i =0;i<arr.length;i++){
            if (tar!=arr[i]) {
                arr1[ind] = arr[i];
                ind++;
            }
        }
        for (int i=0;i<ind;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
