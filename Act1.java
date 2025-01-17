package com.mycompany.actividad1;
public class Act {

    public static void main(String[] args) {
int arreglo [] = {4, 15, 1, 10, 30, 8, 2};
int arreglo2 [] = new int[arreglo.length];
int mayor = 0, indice = 0;
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("vueltas en i:"+i+"\tel valor de indice:"+indice);
            for (int j = 0; j < arreglo.length; j++) {
                if (mayor < arreglo[j]) {
                    mayor = arreglo[j];
                    indice = j;
                    System.out.println("el valor del indice dentro del if:"+indice);
                }
              }
            arreglo2[i] = mayor;
            mayor = 0;
            arreglo[indice] = 0;
            System.out.println(arreglo2[i]);
            }
        }
    }