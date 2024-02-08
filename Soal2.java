/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2;

/**
 * Program ini akan menampilkan string hasil operasi ternary bercabang
 * @author Reqi Jumantara Hapid
 * 09-02-2024
 */
public class Soal2 {

    public static void main(String[] args) {
        int i = 42;
            String s = (i<40) ? "Life" : (i>50) ? "universe" : "everything";
        System.out.println(s);
    }
}
