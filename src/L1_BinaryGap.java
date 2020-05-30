public class L1_BinaryGap {
    public static void main(String[] args) {
        Solution_BG S = new Solution_BG();
        System.out.println(S.solution(328) + " == 2");
        System.out.println(S.solution(51712) + " == 2");
        System.out.println(S.solution(32) + " == 0");
        System.out.println(S.solution(1041) + " == 5");
        System.out.println(S.solution(15) + " == 0");

        System.out.println(S.solution(561892) + " == 3");
        System.out.println(S.solution(74901729) + " == 4");

    }
}



class Solution_BG {
    public int solution(int N) {
        //System.out.println("-------//---------");
        String binario = "";
        int contador = 0, aux = 0;
        while(N > 0){
            int a = N % 2;
            binario = a + binario;
            N = N / 2;

        }
        //System.out.println(binario);
        //System.out.println("length = "+(binario.length()));

        for(int i = 0; i < binario.length(); i++){
            char b = binario.charAt(i);
            char t = binario.charAt((binario.length()-1));
            char u = 9;
            //System.out.println("|| binario -> [" + b + "]  posicao" + (i+1));
            //System.out.println("T é: "+t);
            if(b == '0'){
                aux = aux + 1;
            }else if(b == '1'){
                if(contador <= aux){
                    contador = aux;
                    //System.out.println("Contador -> " + contador);
                    u = binario.charAt(i);
                }
                aux = 0;
            }else if(t == u){
                //System.out.println("U: "+u);
                contador = 0;
            }
        }

        return contador;
    }
}