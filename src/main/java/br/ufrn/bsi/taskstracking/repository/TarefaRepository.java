package br.ufrn.bsi.taskstracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufrn.bsi.taskstracking.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    List<Tarefa> findByNome(String nome);

    Tarefa findById(long id);
}
