public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }

    public static int factorial(int i){

        if(i == 100) {
            System.out.println("재귀 종료");
            return 0;
        }

        System.out.println(i);
        return factorial(i + 1);

    }
}
