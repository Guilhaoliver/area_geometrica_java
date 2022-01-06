package com.senac;

public class Main {

    public static void main(String[] args) {

        double ladoQuadrado = 4.3;
        double resultadoLadoQuadrado;

        resultadoLadoQuadrado(ladoQuadrado);

        double baseDoTriangulo = 2.13;
        double alturaDoTriangulo = 4;
        double areaDoTriangulo;

        areaDoTriangulo(baseDoTriangulo , alturaDoTriangulo);

        double raioDoCirculo = 2;
        double variavelPi = 3.14;
        double areaDoCirculo;

        areaDoCirculo(raioDoCirculo , variavelPi);

    }

    private static void areaDoCirculo(double raioDoCirculo, double variavelPi) {
        System.out.println(raioDoCirculo*variavelPi);
    }

    private static void areaDoTriangulo(double baseDoTriangulo, double alturaDoTriangulo) {
        System.out.println(alturaDoTriangulo*baseDoTriangulo);
    }

    private static void resultadoLadoQuadrado(double ladoQuadrado) {
        System.out.println(ladoQuadrado*ladoQuadrado);
    }
}
