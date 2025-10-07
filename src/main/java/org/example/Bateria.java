package org.example;

public class Bateria extends Instrumentos {
    private int numeroPecas;

    public Bateria(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Mandando um ritmo de rock no " + super.getNome() + " com " + numeroPecas + " peças.");
        System.out.println("Batendo no bumbo e pratos com energia!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das peles e o posicionamento dos pratos da bateria.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de Peças: " + numeroPecas);
    }
}