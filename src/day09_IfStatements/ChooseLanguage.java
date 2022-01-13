package day09_IfStatements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = number.nextInt();

        String nameOfNumber;
        if (num == 1) {
            nameOfNumber = "Hello, thank for your call";
        } else if (num == 2) {
            nameOfNumber = "Hola, gracias para llamar";
        } else if (num == 3) {
            nameOfNumber = "Merhaba, aradiginiz icin tesekkurler";
        } else if (num == 4) {
            nameOfNumber = "Privet, spasibo za vash zvonok";
        } else {
            nameOfNumber = "Merci ,pour votre appel";
        }
        System.out.println(nameOfNumber);
    }
    }

/*
3. Creat a class called ChooseLanguage, Given an integer variable named selection t
hat has a number between 1~5, Write a program that can select the language based on the number
that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */