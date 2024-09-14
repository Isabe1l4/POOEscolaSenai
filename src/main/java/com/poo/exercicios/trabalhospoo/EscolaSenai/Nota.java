package com.poo.exercicios.trabalhospoo.EscolaSenai;

public class Nota {
    private Professor professor;
    private Aluno aluno;
    private Disciplina notaDisciplina;

    public Nota(Professor professor, Aluno aluno,  Disciplina notaDisciplina){
        this.professor = professor;
        this.aluno = aluno;
        this.notaDisciplina = notaDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAlunos(Aluno aluno) {
        this.aluno = aluno;
    }
    public Disciplina getDisciplina(){
        return notaDisciplina;
    }
    public void setDisciplina(Disciplina noDisciplina) {
        this.notaDisciplina = noDisciplina;        
    }

    public static void listarNotas(){
        

        
    }
}
