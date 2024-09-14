package com.poo.exercicios.trabalhospoo.EscolaSenai;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {

    private static Scanner leia = new Scanner(System.in);
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(int id, String nome, String cpf) {
        super(id,nome,cpf);
    }
    public Aluno(){}

    public static void cadAluno(){     
          
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do(a) aluno(a) que deseja matricular: ");
        String nome = leia.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        alunos.add(aluno);
        System.out.println("O aluno "+aluno.getNome()+" foi cadastrado.");
    }
    public static void listarAlunos(){
                     
        for (int i = 0; i < alunos.size(); i++) {
            //incluir matricula
            System.out.println((i+1) +" - " + alunos.get(i).getNome());
        }
    }
    public static void deleteAluno(){
        // Deletar aluno
        
        listarAlunos();
        System.out.printf("\nInforme o(a) aluno(a) a ser excluído(a):\n");
        int i = leia.nextInt();
        alunos.remove(i-1);
        System.out.printf("Aluno "+i+" foi removido.");       
    }

    public static void preCarregarAlunos() {
        alunos.add(new Aluno(1, "João", "123.456.789-00"));
        alunos.add(new Aluno(2, "Maria", "987.654.321-00"));
        alunos.add(new Aluno(3, "Pedro", "456.789.123-00"));
        alunos.add(new Aluno(4,"Paulo", "733.845.277-28"));

    }
}