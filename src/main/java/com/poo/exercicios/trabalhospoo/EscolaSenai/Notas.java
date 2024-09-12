package com.poo.exercicios.trabalhospoo.EscolaSenai;

public class Notas {
    private Professores professores;
    private Aluno aluno;
    private int atividades;
    private int trabalhos;
    private int provas;

    public Notas(Professores professores, Aluno aluno, int atividades, int trabalhos, int provas){
        this.professores = professores;
        this.aluno = aluno;
        this.atividades = atividades;
        this.trabalhos = trabalhos;
        this.provas = provas;

       }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAlunos(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getAtividades() {
        return atividades;
    }

    public void setAtividades(int atividades) {
        this.atividades = atividades;
    }

    public int getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(int trabalhos) {
        this.trabalhos = trabalhos;
    }

    public int getProvas() {
        return provas;
    }

    public void setProvas(int provas) {
        this.provas = provas;
    }

}
