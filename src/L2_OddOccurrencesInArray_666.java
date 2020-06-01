import java.util.*;

public class L2_OddOccurrencesInArray_666 { //ano que vem volto aqui sim s
    public static void main(String[] args) {
        Solution_OOIA s = new Solution_OOIA();
        //int A[] = {2, 2, 3, 3, 4};
        //int A[] = {2, 2, 3, 4, 4};
        int A[] = {42};
        System.out.println(s.solution(A));
    }
}

class Solution_OOIA {
    public int solution(int[] A) {
        Arrays.sort(A);
        int anterior = 0;
        if (A.length == 1 || A.length == 2) {
             anterior = A[0];
        }
        else if (A[A.length-2] != A[A.length-1]) {
            anterior = A[A.length-1];
        } else {
        for (int i = 0; i < (A.length-2); i++){
            //System.out.println(A[i]);

            if (A[i] != A[i+1] && A[i+1] != A[i+2]){
                anterior = A[i+1];
                //System.out.println(A[i+1]);
                break;
            }

            }
        }
        //System.out.println("resultado: "+anterior);
        return anterior;
    }
}