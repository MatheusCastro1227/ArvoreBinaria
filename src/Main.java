//versão do java: java21

public class Main {
    public static void main(String[] args) {
        No folhaEsq = Arvore.criaRaiz(5, null, null);
        No folhaDir = Arvore.criaRaiz(10, null, null);

        No raiz = Arvore.criaRaiz(7, folhaEsq, folhaDir);

        System.out.println("Raiz: " + raiz.info);
        System.out.println("Filho esquerdo: " + raiz.esquerda.info);
        System.out.println("Filho direito: " + raiz.direita.info);
    }
}