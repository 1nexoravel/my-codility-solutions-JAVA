public class L3_TapeEquilibrium {
    public static void main(String[] args) {
        SolutionTP s = new SolutionTP();
        int A[] = {3,1,2,4,3};
        System.out.println(s.solution(A) + " === 1");

    }
}



class SolutionTP {
    public int solution(int[] A) {
        int ascVet[] = new int[A.length], descVet[] = new int[A.length];
        int diferenca, ascendente, descendente;
        int menorDiferenca = 100001, a = 0;
        ascendente = descendente = diferenca = 0;
        for(int i = 0; i < (A.length-1); i++){
            ascendente = ascendente + A[i];
            ascVet[i] = ascendente;
        }
        for(int j = (A.length-1); j > 0; j--){
            descendente = descendente + A[j];
            descVet[j] = descendente;
        }
        for(int k = 0; k < (A.length-1); k++){


            diferenca = Math.abs(ascVet[a] - descVet[a+1]);
            System.out.println(ascVet[a] + " - " + descVet[a+1] + " = " + diferenca);
            if(diferenca < menorDiferenca){
                menorDiferenca = diferenca;
            }
            a++;
        }
        // descendente = 0;
        return menorDiferenca;
    }

}