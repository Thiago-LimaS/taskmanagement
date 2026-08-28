package com.thiago.taskmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tasks")

public class Task {
    @Id
    @GeneratedValue
    private Long id;

    private String titulo;
    private String descricao;
    private boolean concluida;

    public Long getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

}
