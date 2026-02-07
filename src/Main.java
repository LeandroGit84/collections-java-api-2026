import main.java.list.OperacoesBasicas.ListaDeTarefas.ListaTarefa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    listaTarefa.adicionarTarefa("tarafa1");


        System.out.println("Total de elementos na lista: " +  listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();


    }

}