package CuentaBancaria;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        CuentaBancaria usuario1 = new CuentaBancaria("1234", 100.90);
        CuentaBancaria usuario2 = new CuentaBancaria("12345", 99.99);

        usuario1.depositar();
        usuario1.retirar();
        usuario1.consultarSaldo();

        usuario2.depositar();
        usuario2.retirar();
        usuario2.consultarSaldo();


    }
}

