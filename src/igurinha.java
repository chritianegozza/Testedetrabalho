import java.util.Scanner;
/*
Esse funciona no meu
* */
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=0 ; i<n ; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int menor = Math.min(a,b);
            int result = figurinha(a,b,menor);
            System.out.println(result);
        }
        scan.close();
    }

    private static int figurinha(int a, int b, int menor) {
        if (a % menor == 0 && b % menor == 0)
            return menor;
        else {
            menor--;
            return figurinha(a, b, menor);

        }
    }
}