// Joseph Recursion Problem
//way to move from start to destination in matrix
public class Joseph {
    
    public static int allWays( int n, int m){

        if(m==1 || n==1){
            return 1;
        }

        return allWays( n, m-1)+allWays( n-1, m);
    }

    //shot each other standing in circle
    //with n people and shooting the person on k=3 person steps after him
    //return the person who stays alive
    public static int josephProblem(int n, int k) {
        if(n==1){
            return 0;
        }
        return (josephProblem(n-1, k)+k)%n;
    }

    public static void main(String[] args) {
        
    }
}
