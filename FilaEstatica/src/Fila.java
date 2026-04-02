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

    /*
    public void atualizarFila(){//logica) para excluir espaços de memoria já desinfileirar e  abrir novos espaços de memória
        if(desenfileirar()){


        }

        */

/*public class Fila {
    private int elementos[];
    private int inicio;
    private int fim;
    private int total;

    public Fila(int tamanho){
        this.elementos = new int[tamanho];
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
    }

    public boolean verificarFilaCheia() {
        if (total == elementos.length){
            return true;
        }
        return false;
    }

    public boolean verificarFilaVazia() {
        if (total == 0){
            return true;
        }
        return false;
    }

    public void enfileira(int valor){
        if (verificarFilaCheia()){
            System.out.println("Fila cheia, impossível enflireirar!");
        }
        else{
            elementos[fim] = valor; //verivicar  função verificarFilaCheia
            fim = (fim +1) % elementos.length;
            total ++;
            System.out.println("Inserido: " + valor);
        }
    }

    public void desenfileira(){
        if (verificarFilaVazia()){
            System.out.println("Fila vazia, impossível desenfileirar!");
        }
        else{
            int valorRemovido = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            total--;
            System.out.println("Removido: " + valorRemovido);
        }
    }

    public int retornarFim(){
        return elementos[fim];
    }

    public void imprimirFila(){
        if (verificarFilaVazia()) {
            return;
        }
        System.out.print("Fila: ");
        for(int i = 0; i < total; i++) {
            int x = (inicio + i) %  elementos.length;
            System.out.print(elementos[x]);

            if (i < total - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}"

*/

