package br.ufrn.bsi.taskstracking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.ufrn.bsi.taskstracking.model.Tarefa;
import br.ufrn.bsi.taskstracking.repository.TarefaRepository;

@Controller
public class TarefaController {

    @Autowired
	private TarefaRepository tarefaRepository;

    @GetMapping("/home")
    public String home(Model model) {

        System.out.println("Criando Tarefas!");	
        Tarefa t1 = new Tarefa("T01", "Criando um JpaReposity");
        Tarefa t2 = new Tarefa("T02", "Testando Projeto Spring Boot com JPA");

        System.out.println("Salvando Tarefas!");
        this.tarefaRepository.save(t1);
        this.tarefaRepository.save(t2);

        List<Tarefa> tarefas = tarefaRepository.findAll(Sort.by(Sort.Direction.ASC, "dataCriacao"));

        model.addAttribute("tarefas", tarefas);
		return "home";
	}
    
}
