public class L2_CyclicRotation {
    public static void main(String[] args) {
        Solution_CR s = new Solution_CR();
        int A[] = {3, 8, 9, 7, 6};
        int K = 3;
        System.out.println("A = [3, 8, 9, 7, 6]\nK = 3");
        System.out.println(s.solution(A,K));
        for(int i = 0; i < A.length-1; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(" == [9, 7, 6, 3, 8]\n");

        int B[] = {1, 2, 3, 4};
        int L = 4;
        System.out.println("A = [1, 2, 3, 4]\nK = 4");
        System.out.println(s.solution(B,L));
        for(int i = 0; i < B.length-1; i++){
            System.out.print(B[i] + ", ");
        }
        System.out.print(" == [1, 2, 3, 4]");

    }
}

class Solution_CR {
    int aux;
    public int[] solution(int[] A, int K) {
        try {
            for (int i = 0; i < K; i++) {
                //System.out.println("\n");
                aux = A[A.length - 1];
                for (int j = (A.length - 1); j > 0; j--) {
                    A[j] = A[j - 1];
                    //System.out.print(A[j] + ", ");
                }
                //System.out.print(aux + ", ");
                A[0] = aux;
            }
        }catch (Exception e){
            System.out.println("Preguiça tem nome! && pega a borra pra limpar a memória");
        }
        return A;
    }
}
