package com.exercice1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal x = new Animal("Light", 1, "chat");
		Animal x2 = new Animal("Luky", 2, "chien");
		Scanner y = new Scanner(System.in);

		System.out.println(x);
		x.afficherInfo();
		x2.afficherInfo();
		
		x.setNom("Lili");
		x.setAge(3);
		x.age=4;
		
		x.afficherInfo();
		
	}

}
