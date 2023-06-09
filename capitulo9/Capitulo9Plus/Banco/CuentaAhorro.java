package Capitulo9Plus.Banco;

public class CuentaAhorro extends CuentaBancaria {



    private static double saldoMinimo = 100;

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }
    
    

    @Override
    public void calcularIntereses() {
        double interes;
        if (getSaldo() < saldoMinimo) {
            interes = 0.5 * getInteresAnualBasico() * getSaldo();
        } else {
            interes = 2 * getInteresAnualBasico() * getSaldo();
        }
        anadir(interes);
    }


    
}
