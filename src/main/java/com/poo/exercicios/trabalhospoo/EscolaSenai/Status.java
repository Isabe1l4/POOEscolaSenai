package com.poo.exercicios.trabalhospoo.EscolaSenai;

public enum Status {
    REPROVADO("Reprovado(a)"),
    APROVADO("Aprovado(a)"),
    EM_RECUPERACAO("Em Recuperação");

    private final String descricao2;

    Status(String descricao2){
        this.descricao2 = descricao2;
    }
    
    public String getDescricao2(){
            return descricao2;
    }
}
