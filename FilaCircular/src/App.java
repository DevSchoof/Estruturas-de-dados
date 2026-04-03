public class App {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.imprimirFila();

        fila.desenfileirar();
        fila.imprimirFila();

        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.enfileirar(60);
        fila.imprimirFila();

        // Teste de comportamento circular
        fila.enfileirar(70); // Deve mostrar "Fila cheia"
        fila.desenfileirar();
        fila.enfileirar(70);
        fila.imprimirFila();
    }
}

/*

public class App {
    public static void main(String[] args) throws Exception {
        Fila F1 = new Fila(10);
        F1.imprimirFila();
        F1.enfileirar(40);
        F1.enfileirar(50);
        F1.imprimirFila();
        F1.desenfileirar();
        F1.desenfileirar();
        F1.desenfileirar();
        F1.imprimirFila();
        F1.enfileirar(140);
        F1.enfileirar(520);
        F1.enfileirar(1430);
        F1.enfileirar(5206);
        F1.enfileirar(140);
        F1.enfileirar(520);
        F1.enfileirar(1430);
        F1.enfileirar(5206);
        F1.enfileirar(140);
        F1.enfileirar(520);
        F1.enfileirar(1430);
        F1.enfileirar(5206);
        F1.imprimirFila();
    }
}
    */
