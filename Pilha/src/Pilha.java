public class Pilha {
    private int elementos[];
    private int topo;
   

    public Pilha(int tamanho){
        this.elementos = new int[tamanho];
        this.topo = -1;
    }

    public boolean verificarPilhaCheia() {
        if (topo == elementos.length -1){
            System.out.println("Cheia");
            return true;
        }
        return false;
    }

    public boolean verificarPilhaVazia() {
        if (topo == elementos[0]){
            System.out.println("Vazia");
            return true;
        }
        return false;     
    }

    public void empilha(int valor){
        if (verificarPilhaCheia()){
            System.out.println("Pilha cheia, impossível empilhar!");
        }   
        else{
            topo++;
            elementos[topo] = valor;
            System.out.println("Inserido: " + valor);
        }
    }

    public void desempilha(){
        if (verificarPilhaVazia()){
            System.out.println("Pilha vazia, impossível desempilhar!");
        }
        else{
           
            int valorRemovido = elementos[topo];
             topo--;
            System.out.println("Removido: " + valorRemovido);
        }
    }

    public int retornarTopo(){
        return elementos[topo];
    }

    public void imprimirPilha(){
        System.out.print("Pilha: ");
        for(int x=topo ; x >=  0; x--){
            
            System.out.print(" " + elementos[x]);
    }
    System.out.println();
}
}
