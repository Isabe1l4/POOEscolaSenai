package com.poo.exercicios.trabalhospoo.EscolaSenai;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.exercicios.trabalhospoo.EscolaSenai.Disciplina;

@SpringBootApplication
public class Trabalho1Application{
    public static void main(String[] args){
    
            int opcao;
            do {
                
                System.out.print("--------------------------------");
                System.out.print("\n- SEJA BEM VINDO(A) AO MENU -");
                System.out.print("--------------------------------\n");
                System.out.println("\nO que deseja fazer?");
                System.out.println("1- Cadastrar novo aluno");
                System.out.println("2- Deletar aluno");
                System.out.println("3- Listar alunos");
                System.out.println("0- Sair\n");
                System.out.print("Digite uma opção: ");

                Scanner sc = new Scanner(System.in);

                opcao = sc.nextInt();

                System.out.println("\n");
    
                int i;
                Scanner leia = new Scanner(System.in);
                ArrayList<String> novoAluno = new ArrayList();

                switch(opcao){
                    case 1:
                        //Cadastrar aluno
                        String nomeAluno;

                        System.out.println("Digite o nome do(a) aluno(a) que deseja matricular: ");
                        nomeAluno = leia.nextLine();
                        novoAluno.add(nomeAluno);
                    
                        for (i = 0; i < novoAluno.size(); i++) {
                            System.out.println("O aluno "+novoAluno+" foi cadastrado.");
                        }
                    
                    break;

                    case 2:
                        // Deletar aluno
                        System.out.printf("\nInforme o(a) aluno(a) a ser excluído(a):\n");
                            
                        i = leia.nextInt();

                        try {
                        novoAluno.remove(i);
                        System.out.printf("Aluno "+i+" foi removido.");

                        } catch (IndexOutOfBoundsException e) {
                        // exceção lançada para indicar que um índice (i)
                        // está fora do intervalo válido
                        System.out.printf("\nErro: aluno inválido (%s).",
                            e.getMessage());
                            }

                    break;

                    case 3:
                        System.out.printf("\nPercorrendo o ArrayList\n");

                        i = 0;

                        for (String matricula: novoAluno) {
                        System.out.printf("Aluno %d- %s\n", i, matricula);
                        i++;
                        }

                    break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;
                        
                }
                
            }while(opcao != 0);
    }
}