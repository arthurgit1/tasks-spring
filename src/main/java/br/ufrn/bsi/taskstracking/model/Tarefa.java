package br.ufrn.bsi.taskstracking.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tarefa_id")
    private long id;

    @Column(length = 50, nullable = false)
    private String identificador;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 250, nullable = true)
    private String descricao;

    @Column(nullable = false)
    private LocalDateTime criada_em;

    @Column(nullable = true)
    private LocalDateTime fechada_em;

    private Tarefa() {}

    public Tarefa(String identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
        this.criada_em = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriada_em() {
        return criada_em;
    }

    public void setCriada_em(LocalDateTime criada_em) {
        this.criada_em = criada_em;
    }

    public LocalDateTime getFechada_em() {
        return fechada_em;
    }

    public void setFechada_em(LocalDateTime fechada_em) {
        this.fechada_em = fechada_em;
    }

    @Override
    public String toString() {
        return this.identificador + " - " + this.nome;
    }
}