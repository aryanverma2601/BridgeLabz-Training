import java.util.*;

public class review{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int n=5;
        int count0=0,count1=0,count2=0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else if(arr[i] == 2){
                count2++;
            }
        }

        int[] arr1 = new int[count0];
        int[] arr2 = new int[count1];
        int[] arr3 = new int[count2];
        int idx1=0,idx2=0,idx3=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                arr1[idx1]=0;
                idx1++;
            }
            else if(arr[i] == 1){
                arr2[idx2]=1;
                idx2++;
            }
            else if(arr[i] == 2){
                arr3[idx3]=2;
                idx3++;
            }
        }

        int[] ans = new int[5];
        int idx=0;
        for(int i=0;i<arr1.length;i++){
            ans[idx]=arr1[i];
            idx++;
        }
        for(int i=0;i<arr2.length;i++){
            ans[idx]=arr2[i];
            idx++;
        }
        for(int i=0;i<arr3.length;i++){
            ans[idx]=arr3[i];
            idx++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
