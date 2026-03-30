public class App {
    public static void main(String[] args) throws Exception {
        Pilha P1 = new Pilha(5);
        P1.empilha(10);
        P1.desempilha();
        P1.empilha(15);
        P1.empilha(38);
        P1.imprimirPilha();
        P1.desempilha();
        P1.imprimirPilha();
        P1.empilha(20);
        P1.empilha(135);
        P1.empilha(3800);
        P1.empilha(9);
        P1.empilha(-27);
        P1.imprimirPilha();
    }
}
