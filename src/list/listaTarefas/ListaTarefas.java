package list.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> lista;

    public ListaTarefas() {
        this.lista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa t = new Tarefa(descricao);
        lista.add(t);
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : lista) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        lista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return lista.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(lista);
    }
}
