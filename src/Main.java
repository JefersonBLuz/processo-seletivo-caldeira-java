import Atividades.*;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {

        int expression;


        do {
            System.out.println("Digite o número da questão que deseja executar ou 0 para sair:");
            expression = Integer.parseInt(System.console().readLine());
            switch (expression) {
                case 1:
                    System.out.println("1º Questão, Agendamento, resultado:");
                    Atividades.Agendamento.main(args);
                    break;
                case 2:
                    System.out.println("2º Questão, Avaliação, resultado:");
                    Atividades.Avaliacao.main(args);
                    break;
                case 3:
                    System.out.println("3º Questão, Item, resultado:");
                    Atividades.Item.main(args);
                    break;
                case 4:
                    System.out.println("4º Questão, Fluxo, resultado:");
                    Atividades.Fluxo.main(args);
                    break;
                case 5:
                    System.out.println("5º Questão, Notificação, resultado:");
                    Atividades.Notificacao.main(args);
                    break;
                case 6:
                    System.out.println("6º Questão, Array, resultado:");
                    Atividades.Array.main(args);
                    break;
                case 7:
                    System.out.println("7º Questão, Livro, resultado:");
                    Livro l = new Livro();
                    l.titulo = "Java para Iniciantes";
                    System.out.println(l.status());
                    l.emprestar();
                    System.out.println(l.status());
                    break;
                case 8:
                    System.out.println("8º Questão, Usuario, resultado:");
                    Usuario u = new Usuario("João", 25);
                    System.out.println(u);
                    break;
                case 9:
                    System.out.println("9º Questão, Manipulação de dados, resultado:");
                    LocalDate hoje = LocalDate.of(2025, 6, 9);
                    LocalDate prazo = hoje.plusDays(10);
                    System.out.println(prazo);
                    break;
                case 10:
                    System.out.println("10º Questão, Manipulação de datas, resultado:");
                    LocalDate data = LocalDate.of(2025, 6, 10);
                    int diasUteis = 0;
                    while (diasUteis < 7) {
                        data = data.plusDays(1);
                        boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
                        boolean feriado = data.equals(LocalDate.of(2025, 6, 15));
                        if (!fimDeSemana && !feriado) {
                            diasUteis++;
                        }
                    }
                    System.out.println(data);
                    break;
                case 11:
                    System.out.println("11º Questão, Manipulação de horários, resultado:");
                    LocalTime envio = LocalTime.of(23, 0);
                    LocalTime limite = LocalTime.of(22, 59);
                    if (!envio.isBefore(limite)) {
                        System.out.println("Entrega fora do horário.");
                    } else {
                        System.out.println("Tarefa enviada com sucesso.");
                    }
                    break;
                case 12:
                    System.out.println("12º Questão, Ordenação de tarefas, resultado:");
                    Atividades.Tarefa.main(args);
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Questão não encontrada");
                    break;
            }
        } while (expression != 0);
        System.out.println("Sistema encerrado!");
    }
}