public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Maria");
        conta1.depositar(1000);
        conta1.sacar(500);
        conta1.exibirSaldo();
    }
}