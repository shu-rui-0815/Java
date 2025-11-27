import java.util.*;

public class A1113327_0317_1 {
    public static void main(String[] args){
        System.out.print("請輸入兩個值:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = (i+1)*(j+1);
            }
        }

        for(int[] num : a){
            for(int b : num){
                System.out.print(b + "\t");
            }
            System.out.println();
        }
    }
}
