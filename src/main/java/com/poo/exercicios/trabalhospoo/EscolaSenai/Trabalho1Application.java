package com.poo.exercicios.trabalhospoo.EscolaSenai;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


//import com.poo.exercicios.trabalhospoo.EscolaSenai.Disciplina;

@SpringBootApplication
public class Trabalho1Application{
    public static void main(String[] args){
               
        Aluno.preCarregarAlunos();
        int opcao;
        //professor lançar nota
        //aluno ver nota
        //login
        //criar menus

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

            switch(opcao){
                case 1:
                    Aluno.cadAluno();
                break;

                case 2:
                    Aluno.deleteAluno();
                break;

                case 3:
                    Aluno.listarAlunos();
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