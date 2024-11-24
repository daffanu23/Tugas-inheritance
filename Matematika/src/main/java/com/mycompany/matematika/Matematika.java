/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matematika;

/**
 *
 * @author Daffa
 */
public class Matematika {
    int operasi;
    void pertambahan (int a, int b){
    operasi = a + b;
    System.out.println("Hasil pertambahan: " + operasi);
    }
    
    void pengurangan (int a, int b){
    operasi = a - b;
    System.out.println("Hasil pengurangan: " + operasi);
    }

    void perkalian (int a, int b){
    operasi = a * b;
    System.out.println("Hasil perkalian: " + operasi);
    }

    void pembagian (int a, int b){
    operasi = a / b;
    System.out.println("Hasil pembagian: " + operasi);
    }

}