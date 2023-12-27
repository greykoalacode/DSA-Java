public class primeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrime(8));
    }

    private static boolean checkPrime(int n){
        if(n <= 3){
            return true;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
