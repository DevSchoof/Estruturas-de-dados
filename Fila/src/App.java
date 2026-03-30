public class App {
    public static void main(String[] args) throws Exception {
        Fila F1 = new Fila(5);
        F1.enfileira(13);
        F1.imprimirFila();
        F1.enfileira(14);
        F1.desenfileira();
        F1.desenfileira();
        F1.desenfileira();
        F1.enfileira(15);
        F1.enfileira(16);
        F1.enfileira(17);
        F1.desenfileira();
        F1.enfileira(18);
        F1.enfileira(19);
        F1.enfileira(18);
        F1.enfileira(19);
        F1.imprimirFila();
    }
}
