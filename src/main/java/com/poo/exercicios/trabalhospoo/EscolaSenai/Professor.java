package com.poo.exercicios.trabalhospoo.EscolaSenai;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {

    Scanner leia = new Scanner(System.in);
    private static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(int id, String nome) {
        super(id, nome, nome);
    }

    public Professor(){}

    public static void cadProfessor() {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do(a) professor(a) que deseja adicionar: ");
        String nome = leia.nextLine();
        Professor professor = new Professor();
        professor.setNome(nome);
        professores.add(professor);
        System.out.print("O professor" + professor.getNome()+" foi cadastrado.");

    }

    public static void listarProfessores(){

        for (int i = 0; i < professores.size(); i++) {
        System.out.print((i+1) + " - " + professores.get(i).getNome());
        }
    }

    public static void deleteProfessor() {
        Scanner leia = new Scanner(System.in);

        listarProfessores();
        System.out.print("\nInforme o(a) professor(a) a ser excluído(a):\n");
        int i = leia.nextInt();
        professores.remove(i-1);
        System.out.print("Professor " + i + " foi removido.");

    }
    /*public static void lancarNota(){

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o id do aluno para lançar nota: ");
        int i = leia.nextInt();

        Aluno aluno = alunos.get(i-1);

        System.out.print("Digite a nota do aluno" + aluno.getNome());
        double nota = leia.nextDouble();
        
        Nota.nota.add(nota);

        System.out.print("Nota " + nota + " lançada para " + aluno.getNome());

    }*/

    public static void preCarregarProfessores() {
        professores.add(new Professor(1, "Arthur"));
        professores.add(new Professor(2, "Roni"));
        professores.add(new Professor(3, "Tiago"));
    }

}