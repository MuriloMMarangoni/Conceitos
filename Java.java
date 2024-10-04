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
        int in = 1; // Int
        char c = 'a'; // char
        boolean b = true; // bool
        in = in + 1; // incremento
        in++; // incremento
        in--; // decremento
        Scanner teclado = new Scanner(System.in); // objeto que pega o input
        in = teclado.nextInt(); // pega o input de um int
        f = teclado.nextFloat(); // pega o input de um float
        s = teclado.next(); // pega o input de uma String
        teclado.close(); // ? faz o scanner parar de ler input
        System.out.printf("%f%f%d",d,f,in); // print formatado (double,float,int)
        System.out.printf("%.2f", f); // 2 casas decimais
        System.out.printf("%s",s); // print formatado(string)
        if (in == 0){ // if, else if, else 
            System.out.println("É zero");
        }
        else if (in < 0){
            System.out.println("É negativo");
        }
        else {
            System.out.println("É positivo");
        }
        while(in != 0){ // while
            System.out.printf("%d\n",in);
            in--;
        }
        for (int i = 0;i<10;i++) { // for loop
            System.out.println(i);
        }
        int arr[] = {1,2,3}; // array
        arr[0] = 0; // acessa
    }
}