import java.util.*;

public class L4_PermCheck {
    public static void main(String[] args) {
        SolutionPC s = new SolutionPC();

        int[] A = {4, 1, 2, 3};
        System.out.println("1 -> "+s.solution(A));

        int[] B = {2};
        System.out.println("0 -> "+s.solution(B));

        int[] C = {4, 1, 3};
        System.out.println("0 -> "+s.solution(C));

        int[] D = {1};
        System.out.println("1 -> "+s.solution(D));

        int[] E = {4, 2, 3};
        System.out.println("0 -> "+s.solution(E));

        int[] F = {6, 5, 3, 2, 1};
        System.out.println("0 -> "+s.solution(F));

        int G[] = new int[100050]; //Teste grande: Não funciona: não sei o porquê | funciona: não sei o porquê...
        for (int i = 1; i < G.length+1; i++){
            G[i-1] = i;
            //System.out.println("i: "+ i + " G: "+ G[i-1]);
        }
        //System.out.println(G.length);
        System.out.println("1 -> "+s.solution(G));
    }

}

class SolutionPC {
    public int solution(int[] A) {
        int solucao = -1;
        Arrays.sort(A);
        if( (A[0] != 1) || (A.length <= 1 && A[0] != 1) ){
            return 0;
        }

        long permutacaoVetor = 1, permutacaoNormal = 1, multi = 2;
        for(int i = 1; i < A.length; i++){
            permutacaoVetor = (permutacaoVetor*A[i]/i);
            permutacaoNormal = (permutacaoNormal*multi/i);
            multi++;
//            System.out.println(permutacaoVetor + " == "+permutacaoNormal);
            if(A[i-1] == A[i]){
                return 0;
            }
        }

        if(permutacaoVetor == permutacaoNormal) {
            return 1;
        }else if(permutacaoVetor != permutacaoNormal){
            return 0;
        }
        return solucao;
    }
}
