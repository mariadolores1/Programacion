/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md
 */
public class calculadora {

    public static int seriesSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println("keep coding tho");
        }
        int dividendo = n + 3;
        int series[] = {n};
        for (int i = 0; i < n; i++) {
            System.out.println("the series is" + series[n / dividendo]);
            System.out.println("este es la primera pocision" + series[1]);
        }
        return series[n];
    }
    public static void main(String[] args) {
        seriesSum(1);
    }
}
