public class L3_FropJmp {
    public static void main(String[] args) {
        Solution_FJ s = new Solution_FJ();
        System.out.println(s.solution(1, 5, 2) + "-> 2");
        System.out.println(s.solution(10, 85, 30)+ "-> 3");

    }
}

class Solution_FJ { //Solução O(1)    =)
    public int solution(int X, int Y, int D) {
        double contador = 0;
        double Y2 = Y, X2 = X, D2 = D;
        if(X<Y){
            contador = Math.ceil((Y2-X2)/D2);
            //System.out.println(contador);
        }
        return (int)contador;
    }
}