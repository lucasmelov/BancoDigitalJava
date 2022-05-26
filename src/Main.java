public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Lucas");
        cc.depositar(200);
        Conta cp = new ContaPoupanca("Lucas");

        cc.imprimirInfosComuns();
        cp.imprimirInfosComuns();
    }
}
