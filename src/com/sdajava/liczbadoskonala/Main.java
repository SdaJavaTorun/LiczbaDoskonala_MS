package com.sdajava.liczbadoskonala;

public class Main {


    public static void liczbaDoskonala(int liczba){
        int suma = 0;
        for (int i = 1; i < liczba; i++){
            if (liczba % i == 0){
                suma = suma + i;
            }
        }
        if (suma == liczba){
            System.out.println("Liczba " + liczba + " jest liczbą doskonałą.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest liczbą doskonałą.");
        }
    }
    public static void main(String[] args) {
        Main.liczbaDoskonala(28);
    }
}
