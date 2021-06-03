package main;

import bsh.*;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Luiz Flávio
 */
public class Main {
    public static void main(String[] args) throws EvalError, IOException {
        Scanner in = new Scanner(System.in);
        Interpreter i = new Interpreter();
        GeradorDeCodigo gc = new GeradorDeCodigo();
        
        //cabeçalho
        System.out.println("Calculadora Combinatória -> C n,m");
        System.out.println("Calcular o número de maneiras de selecionar M itens de N itens de entrada.");
        System.out.println("A ordem NÃO é importante e um item NÃO pode se repetir!");
        System.out.println("As combinações sempre serão mostradas de 0 até N-1.\n");
        
        //obtendo valores de N e M
        System.out.print("Informe o valor de N: ");
        int n = in.nextInt();
        System.out.print("Informe o valor de M: ");
        int m = in.nextInt();
        
        //gerando código e apresentando-o via console
        String codigoGeradoDinamicamente = gc.gerardorDeCodigoCombinacao(n, m); 
        System.out.println("\nCódigo gerado: ".concat(codigoGeradoDinamicamente));
        
        //setando variáveis ao Interpreter e executando código gerado
        System.out.println("\nCombinações Possíveis:");
        i.set("n", n);
        i.set("m", m);
        i.eval(codigoGeradoDinamicamente);
    }
}
