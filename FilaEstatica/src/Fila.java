public class Fila{
    private int elementos[];
    private int inicio;
    private int fim;

    Fila(int tamanho){
        elementos = new int[tamanho];
        inicio = 0;
        fim = 0;
    }


    public boolean verificarFilaCheia() {
        if (fim == elementos.length){
            return true;
        }
        return false;
    }


    public boolean verificarFilaVazia() {
        if (inicio == fim){
            return true;
        }
        return false;
    }


    public void enfileirar(int valor){
        if (verificarFilaCheia()){
            System.out.println("Fila cheia, impossível enflireirar!");
        }
        else{
            this.elementos[fim] = valor;
            fim++;
        }
    }

    public void desenfileirar(){
        if (verificarFilaVazia()){
            System.out.println("Fila vazia, impossível desenflireirar!");
        }
        else{
            inicio++;
        }
    }

    public void imprimirFila(){
        if (inicio==fim){
            System.out.println("Fila Vazia");
        }
        else{
            System.out.println("Fila: ");
            for (int x = inicio; x< fim; x++){
                System.out.println(x + " - " + elementos[x]);
            }

        }
    }
}