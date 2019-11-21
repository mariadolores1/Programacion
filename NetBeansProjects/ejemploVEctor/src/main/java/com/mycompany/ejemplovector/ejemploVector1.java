/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplovector;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author md
 */
public class ejemploVector1 {

    public void muestraVector(int[] v) {
        for (int valor : v) {
            System.out.println(valor + "");
        }
    }

    public int[] reseteaVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        return v;
    }

    public void multiplicaVector(int[] v, int num) {
        for (int i = 0; i < v.length; i++) {
            v[i] = num * v[i];
            //v[i]*=num; //otra forma

        }
    }

    public int[] illoelclonVector(int[] v, int num) {
        int nuevoVector[] = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            nuevoVector[i] = v[i] * num;
        }
        num++;
        return nuevoVector;
    }

    public static void main(String[] args) {
        Scanner illo = new Scanner(System.in).useLocale(Locale.UK);

        System.out.print("introduca el tamaño del vector");
        int tam = illo.nextInt();
        System.out.println("introduce un numero");

        int vector[] = new int[tam];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = illo.nextInt();
        }

        ejemploVector1 objVector = new ejemploVector1();
        objVector.muestraVector(vector);
        System.out.println("multiplica vector");
//           objVector.multiplicaVector(vector,2);
        int numeroMultiplica = 2;
        int[] nuevooVector = objVector.illoelclonVector(vector, 2);
        System.out.print("resea vector");

        int[] nuevoVector = objVector.reseteaVector(vector);
        objVector.muestraVector(nuevoVector);
        System.out.println(Arrays.toString(nuevooVector));

    }

}
