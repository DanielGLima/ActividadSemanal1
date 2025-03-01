package CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    Scanner sc = new Scanner(System.in);

    //Listar atributos
    private String noCuenta;
    private double saldo;

    //Constructor
    public CuentaBancaria(String noCuenta, double saldo){
        this.noCuenta = noCuenta;
        this.saldo = saldo;
    }

    //Getter and Setters

    public String getNoCuenta(){
        return noCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNoCuenta(String noCuenta){
        this.noCuenta = noCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public void depositar(){
        System.out.println("Ingrese el numero de cuenta: ");
        noCuenta = sc.nextLine();
        System.out.println("Ingrese la cantidad a depositar: ");
        double deposito = sc.nextDouble();
        if(deposito > 0){
            saldo += deposito;
            System.out.println("Su saldo actual es: " + saldo);
        }else{
            System.out.println("El saldo no puede ser menor que 0");
        }
        sc.nextLine();

    }


    public void retirar(){
        System.out.println("Ingrese el numero de cuenta: ");
        noCuenta = sc.nextLine();
        System.out.println("Ingrese la cantidad a retirar: ");
        double retiro = sc.nextDouble();
        if (retiro <= saldo){
            saldo -= retiro;
            System.out.println("su saldo actual es de : " + saldo);
        }else{
            System.out.println("Saldo insuficiente");

        }
        sc.nextLine();
    }

    public void consultarSaldo(){
        System.out.println("Ingrese el numero de cuenta: ");
        noCuenta = sc.nextLine();
        System.out.println("su saldo actual es: " + saldo);
    }

}
