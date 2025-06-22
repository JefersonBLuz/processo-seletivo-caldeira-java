package Atividades;

public class Livro {
    public String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }

    public String status(){
        if (emprestado){
            return "Indisponível";
        }else{
            return "Disponível";
        }
    }
}
