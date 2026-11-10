package com.ex3;

public class Inscription {
    public static boolean validateAge(int age) throws InvalidAgeException{
        if(age<18)throw new InvalidAgeException("Invalid age");
        return true;
    }
}
