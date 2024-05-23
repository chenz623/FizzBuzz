public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int x = 10;
        while(x != 0){

            x = doReduce(x);
            steps ++;
        }
        System.out.println(steps);
    }
    public static int doReduce(int n) {
        boolean even = (n%2 == 0);
        if (even){
            return n/2;
        }else{
            return n-1;
        }
    }
}
