package aula_up;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Porsche", 1985);
        Carro meuOutroCarro = new Carro("Fusca", 1970);
        Carro meuTerceiroCarro = new Carro("Ferrari", 2019);
        System.out.println("Modelo: " + meuCarro.getModelo() + ", Ano: " + 
        meuCarro.getAno());
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar(); 

        ArrayList <Carro> garagem = new ArrayList<>();

        garagem.add(meuCarro);
        garagem.add(meuOutroCarro);
        garagem.add(meuTerceiroCarro);

        for(int i = 0; i < garagem.size(); i++){
            System.out.println("Modelo: " + garagem.get(i).getModelo() + ", Ano: " + garagem.get(i).getAno());
        }
    }
}

