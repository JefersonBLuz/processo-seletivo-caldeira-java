import Atividades.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1º Questão, Agendamento, resultado:");
        Atividades.Agendamento.main(args);
        System.out.println("2º Questão, Avaliação, resultado:");
        Atividades.Avaliacao.main(args);
        System.out.println("3º Questão, Item, resultado:");
        Atividades.Item.main(args);
        System.out.println("4º Questão, Fluxo, resultado:");
        Atividades.Fluxo.main(args);
        System.out.println("5º Questão, Notificação, resultado:");
        Atividades.Notificacao.main(args);
        System.out.println("6º Questão, Array, resultado:");
        Atividades.Array.main(args);
        System.out.println("7º Questão, Livro, resultado:");
        Livro l = new Livro();
        l.titulo = "Java para Iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
        System.out.println("8º Questão, Usuario, resultado:");
        Usuario u = new Usuario("João", 25);
        System.out.println(u);
    }
}