/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dio.trilha.java.basico;

import java.util.Scanner;
import modelo.ContaTerminal;

/**
 *
 * @author Anderson
 */
public class DioTrilhaJavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("-----Cadastro de Conta Bancária-----\n");
        System.out.println("Por favor, digite o numero da Agência!");
        int conta = s.nextInt();
        System.out.println("Informe agora o numero da Agêcia!");
        String agencia = s.next();
        System.out.println("Digite seu nome completo!");
        String nome = s.next();
        System.out.println("Informe o saldo inicial da conta!");
        double saldo = s.nextDouble();
        System.out.println("");

        ContaTerminal ct = new ContaTerminal(conta, agencia, nome, saldo);

        System.out.println("Olá " + ct.getNomeCliente() + ", obrigado por criar uma Conta em nosso Banco, sua Agencia é "
                + ct.getAgencia() + ", Conta " + ct.getNumero() + " e seu Saldo R$ " + saldo + " já está disponovel para saque");

    }
}
