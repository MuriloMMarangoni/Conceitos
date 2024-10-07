public class Pacote {
    int atributo1;
    String atributo2;
    double atributo3;
    static boolean existe = true; // atributo que pode ser acessado sem instancia
    static final boolean existes = true; // final é o mesmo que const
    void mostrar() { // método que pode ser acessado na instância
        System.out.println(atributo1);
        System.out.println(atributo2);
        System.out.println(atributo3);
    }
    int at1x2(int atributo1) { // método que retorna algo e pega um input
        return atributo1*2;
    }
    static void mostrarNome(){
        System.out.println("Essa é a classe Pacote");
    }
    int valor;
    String nome;
    Pacote() {
        System.out.println("Isso acontece se o construtor for chamado sem parâmetros");
    }
    Pacote(int valor,String nome){ // construtor da classe que obriga ter esses parâmetros pra instanciar
        this.valor = valor;
        this.nome = nome;
    }
}

