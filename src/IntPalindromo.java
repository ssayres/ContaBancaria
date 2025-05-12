import java.util.Scanner;

public class IntPalindromo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int original = numero;


        int caixaInvertida = 0;

        while(numero > 0){
            int resto = numero%10;
            caixaInvertida = (caixaInvertida*10)+ resto;
            numero = numero/10;

        }

        if(original == caixaInvertida) {
            System.out.println("É palíndromo :" + caixaInvertida);
        }

        else{
            System.out.println("Não é palíndromo");
        }

    }

}