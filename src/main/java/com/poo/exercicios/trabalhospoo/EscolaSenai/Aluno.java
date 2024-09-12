package com.poo.exercicios.trabalhospoo.EscolaSenai;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoas {

    private int matricula;
    private String nomeMae;
    private String nomePai;
    private static Scanner leia = new Scanner(System.in);
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(String nome, int cpf, String dataNascimento, String endereco, String telefone, int matricula, String nomeMae, String nomePai) {
        super(nome, cpf, dataNascimento, endereco, telefone);

        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }
    public Aluno(){}

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //métodos especificos -> fazem atividades, fazem provas, possuem um intervalo e levam 
    //atividades pra casa

    //Cadastrar aluno
                       

    public static void cadAluno(){     
          
        Scanner leia = new Scanner(System.in);
        //arrumar contrutores
        //classes no singular

        System.out.println("Digite o nome do(a) aluno(a) que deseja matricular: ");
        String nome = leia.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        alunos.add(aluno);
        System.out.println("O aluno "+aluno.getNome()+" foi cadastrado.");
    }
    public static void listarAlunos(){
                     
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).getMatricula() + alunos.get(i).getNome());
        }
    }
    public static void deleteAluno(){
        // Deletar aluno
        System.out.printf("\nInforme o(a) aluno(a) a ser excluído(a):\n");
               
        int i = leia.nextInt();

        try {
        alunos.remove(i);
        System.out.printf("Aluno "+i+" foi removido.");

        } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido
        System.out.printf("\nErro: aluno inválido (%s).",
            e.getMessage());
        }
    }








}