package com.climbstar;

public class ClimbStarsCalc {

    public ClimbStarsCalc(int n) {
        if (verificarNumero(n))
            System.out.println("Digite um numero maior que 0!");
        else
            System.out.println("Há " + climbRecursao(n) + " maneiras distintas de subir até o topo.");
    }

    private int climbRecursao(int n) {
        if (n <= 3)
            return n;

        return climbRecursao(n - 1) + climbRecursao(n - 2);
    }


    private boolean verificarNumero(int n) {
        return n <= 0;
    }
}
