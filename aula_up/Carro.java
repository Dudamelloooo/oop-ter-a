package aula_up;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
        System.out.println("Freando. Velocidade atual: " + velocidadeAtual + " km/h");
    }
}