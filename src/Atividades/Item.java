package Atividades;

public class Item {
    String nome;
    int quantidade;

    public Item(String nome){
        this.nome = nome;
        this.quantidade = 1;
    }

    public Item(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void main(String[] args){
        Item X = new Item("Caderno");
        Item Y = new Item("Caneta", 3);
        System.out.println(X.quantidade + Y.quantidade);
    }
}
