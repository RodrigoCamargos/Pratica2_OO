package br.com.newton;
public class Estoque {

        private String nome;
        private boolean ver = false;
        private int qtdAtual = 1000;
        private int qtaMinima = 50;


        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getQtdAtual () {
            return qtdAtual;
        }

        public void setQtdAtual ( int qtdAtual){
            this.qtdAtual = qtdAtual;
        }

        public int getQtaMinima () {
            return qtaMinima;
        }

        public void setQtaMinima ( int qtaMinima){
            this.qtaMinima = qtaMinima;
        }




    public Estoque(){
            this.nome = nome;
            this.qtdAtual = qtdAtual;
            this.qtaMinima = qtaMinima;

        }

        public void darBaixa ( int qtde){

        }

        public String mostra () {
            return null;
        }


        public boolean precisaRepor ( int qtaMinima){
            return false;
        }


}
