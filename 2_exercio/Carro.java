public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        modeloAno(); 
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void modeloAno() {
        System.out.println("Modelo: " + modelo + " Ano: " + ano);
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

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
