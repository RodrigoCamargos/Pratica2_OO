package br.com.newton;

public class Rendimento {
    private double investimento;
    private double juros;
    private int tempo;

    public Rendimento(double investimentoInicial, double taxaDeInvestiento, int numeroDeMeses) {
        this.investimento = investimentoInicial;
        this.juros = taxaDeInvestiento;
        this.tempo = numeroDeMeses;
    }

    public Rendimento() {

    }


    public double getInvestimentoInicial() {

        return investimento;
    }

    public void setInvestimentoInicial(double investimentoInicial) {

        this.investimento = investimentoInicial;
    }

    public double getTaxaDeInvestiento() {

        return juros;
    }

    public void setTaxaDeInvestiento(double taxaDeInvestiento) {

        this.juros = taxaDeInvestiento;
    }

    public int getNumeroDeMeses() {

        return tempo;
    }

    public void setNumeroDeMeses(int numeroDeMeses) {

        this.tempo = numeroDeMeses;
    }

    public double calcularMontante(){

        return investimento*Math.pow(1+juros,tempo);
    }
    public double calcularJuros(){

        return calcularMontante()-investimento;
    }
}
