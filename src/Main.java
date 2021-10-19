import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] m1 = {1,2,-1,0,8,4,1};
        int[] m2 = {-9,2,4,8,15,23,0,-6,5};
        int[] m3 = new int[m1.length+ m2.length];
        for (int i = 0; i < m1.length; i++)
            m3[i] = m1[i];
        int j = 0;
        for (int i = m1.length; i < m3.length;i++) {
            m3[i] = m2[j];
            j++;
        }
        for (int i = 0; i < m3.length; i++){
            for (int k = 0; k < m3.length; k++){
                if(k !=i && m3[i] < m3[k]){
                    int t = m3[i];
                    m3[i] = m3[k];
                    m3[k] = t;
                }
            }
        }
        for (int i = 0; i < m3.length; i++)
            System.out.print(m3[i]+" ");
    }
}
