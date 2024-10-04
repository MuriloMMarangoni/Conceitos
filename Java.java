import java.util.Scanner; // Classe Scanner

public class Java{ // This class need to have the name of the file
    public static void main(String[] args) {
        System.out.println("teste"); // print + pula linha
        System.out.print("teste2"); // print
        System.out.print("\n"); // pula linha
        String s ; // Declara uma string
        String ss = ""; // Inicializa uma string
        double d = 1.1; // Double
        float f = 1.123f; // Float
        int i = 1; // Int
        char c = 'a'; // char
        boolean b = true; // bool
        i = i + 1; // incremento
        i++; // incremento
        i--; // decremento
        Scanner teclado = new Scanner(System.in); // objeto que pega o input
        i = teclado.nextInt(); // pega o input de um int
        f = teclado.nextFloat(); // pega o input de um float
        s = teclado.next(); // pega o input de uma String
        System.out.printf("%f%f%d",d,f,i); // print formatado (double,float,int)
        System.out.printf("%.2f", f); // 2 casas decimais
        System.out.printf("%s",s); // print formatado(string)
        if (i == 0){ // if, else if, else 
            System.out.println("É zero");
        }
        else if (i < 0){
            System.out.println("É negativo");
        }
        else {
            System.out.println("É positivo");
        }
        while(i != 0){ // while
            System.out.printf("%d\n",i);
            i--;
        }
    }
}