import  java.util.*;
public class L3_PermMissingElem {
    public static void main(String[] args) {
        Solution_PME s = new Solution_PME();
        int A[] = {1,2,3,5};
        System.out.println(s.solution(A) + " === 4");
        int B[] = {2};
        System.out.println(s.solution(B) + " === 1");
        int C[] = {1};
        System.out.println(s.solution(C) + " === 2");
        int D[] = {10,11,12,14,15,16};
        System.out.println(s.solution(D) + " === 13");
        int E[] = {};
        System.out.println(s.solution(E) + " === 1");
        int F[] = {1,2};
        System.out.println(s.solution(F) + " === 3");
    }
}

class Solution_PME {
    public int solution(int[] A) {
        Arrays.sort(A);
        int resultado = 1;
        int i = 0;
        if(A.length > 0){
            int aux = A[0];
            for (i = aux; i < A.length+aux; i++) {
                //System.out.println("i: "+ i + " | A: "+ A[i-aux] + " | aux: " + aux);
                if(A[i-aux] == i-aux+1) resultado = i-aux+2;
                if(A[i-aux] != i){
                    resultado = i;
                    break;
                }
            }
        }
        return resultado;
    }
}