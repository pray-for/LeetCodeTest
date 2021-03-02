package MergeSort;

public class Solution {

    public static void merge(int[] A, int m, int[] B, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int len = m + n;
        int[] C = new int[len];
        while ((i < m) && (j < n)){
            if (A[i] <= B[j]){
                C[k++] = A[i++];
            }
            else{
                C[k++] = B[j++];
            }
        }
        while (i < m){
            C[k++] = A[i++];
        }
        while (j < n){
            C[k++] = B[j++];
        }

        for (int kk = 0; kk < C.length; kk++){
            A[kk] = C[kk];
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        int m = 3;
        int n = 3;
        merge(A, m, B, n);
    }
}
