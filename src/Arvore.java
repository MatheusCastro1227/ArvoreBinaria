class Arvore {

    public static No criaRaiz(int info, No subEsquerda, No subDireita) {
        No raiz = new No(info, subEsquerda, subDireita);
        return raiz;
    }
}