package com.exercice1;

public class Animal {
	
	String nom;
	 int age;
	String type;
	
	public Animal(String nom, int age, String type) {
		
		this.nom = nom;
		this.age = age;
		this.type = type;
	}
	public Animal() {
		this.age = 0;
		this.nom = "";
		this.type = "";
	}

	public String toString(){
		return "toStrign : "+nom+" "+age+" "+type;
	}

	public void afficherInfo() {
		System.out.println(nom + " "+ age + " " + type);
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
