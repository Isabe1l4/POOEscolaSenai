package com.poo.exercicios.trabalhospoo.EscolaSenai;

    /*double media;
    media = (atividades+trabalhos+provas)/2;*/

    public enum Disciplina{
        MATEMATICA("Matemática"), CIENCIAS("Ciências"), GEOGRAFIA("Geografia"), 
        HISTORIA("História"), BIOLOGIA("Biologia"), PORTUGUES("Português"), 
        ARTES("Artes"), FILOSOFIA("Filosofia"), SOCIOLOGIA("Sociologia"), 
        INGLES("Inglês"), FISICA("Física"), QUIMICA("Química"), 
        EDUCACAOFISICA("EducaçãoFísica");

        private final String descricao;

        Disciplina(String descricao){
            this.descricao = descricao;
          
        }
        
        public String getDescricao(){
                return descricao;
        }

        
    }


    

    



