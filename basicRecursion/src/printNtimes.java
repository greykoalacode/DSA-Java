public class printNtimes {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        printNtimesRecursively(4);
        printNameRecursively(0,4);
        printNreverseRecursively(5);
    }

    private static void printNtimesRecursively(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello");
        printNtimesRecursively(n - 1);
    }

    private static void printNameRecursively(int i, int n) {
        if(i > n) return;

        System.out.println("Recursively printing it: "+(i+1));
        printNameRecursively(i+1, n);
    }

    private static void printNreverseRecursively(int n){
        if(n == 0) return;

        System.out.println("printing something: "+n);
        printNreverseRecursively(n-1);
    }
}