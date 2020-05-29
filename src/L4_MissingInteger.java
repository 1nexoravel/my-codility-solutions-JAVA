/*
This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
*/
import java.util.Arrays;

public class L4_MissingInteger {
    public static void main(String[] args) {
        Solution_MI s = new Solution_MI();
        int A[] =  {1, 3, 6, 4, 1, 2};
        System.out.println("A = [1, 3, 6, 4, 1, 2]");
        System.out.println(s.solution(A));

        int B[] = {1, 2, 3};
        System.out.println("A = [1, 2, 3]");
        System.out.println(s.solution(B));

        int C[] = {-1, -3};
        System.out.println("A = [−1, −3]");
        System.out.println(s.solution(C));

    }
}
class Solution_MI {
    public int solution(int[] A) {
        int b = 1;
        Arrays.sort(A);
        for (int k = 0 ; k < A.length ; k++) {
            int c = A[k];
            if( c > 0 ) {
                if((b) == c) {
                    b = c + 1;
                }
            }
            else{
                b = 1;
            }
        }
        return b;
    }
}