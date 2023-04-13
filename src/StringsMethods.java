import java.util.Scanner;

public class StringsMethods {
    Scanner entrada;
    String cadena;

    public StringsMethods() {
        this.entrada = new Scanner(System.in);
        this.cadena = "";
    }

    public int menu() {
        System.out.println("Imprimir caracter por caracter      [1]");
        System.out.println("Contar veces que se repite caracter [2]");
        System.out.println("¿Es palindro?                       [3]");
        System.out.println("Contar vocales y consonantes        [4]");
        System.out.println("Salir                               [1]");
        return entrada.nextInt();
    }

    public void carxcar() {
        entrada.nextLine();
        System.out.println("Ingrese cadena: ");
        cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }

    }
    public void veces() {
        int cont = 0;
        char caracter;
        entrada.nextLine();
        System.out.println("Ingrese cadena: ");
        cadena = entrada.nextLine();
        System.out.println("Ingrese caracter a revisar");
        caracter = entrada.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cont++;
            }

        }
            System.out.println("El caracter " + caracter + " se repite " + cont + " veces.");
    }

    public String eliminaEspacios(String cad) {
        return cad.replace(" ", "");
    }
    public void palindromo() {
        int j;
        boolean sies = true;
        entrada.nextLine();
        System.out.println("Digita una cadena de caracteres: ");
        cadena = entrada.nextLine();
        cadena = eliminaEspacios(cadena);
        j = cadena.length() - 1;

        for (int i =  0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                sies = false;
                System.out.println("No es palindromo");
                break;
            }
            j--;

        }
    }

}
