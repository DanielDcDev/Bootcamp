package com.mycompany.bootcamp_java;
import Dog.Dogs;

public class Class {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
        
        dog1.nome = "Darius";
        dog1.cor = "Preto e vermelho";
        dog1.altura = 50;
        dog1.peso = 10.01;
        dog1.sizeRabo = 30;
            
                
            //System.out.println(dog1.nome);
            dog1.Latir();
            System.out.println("O cachorro esta"+dog1.interate("carinho"));
            System.out.println("O cachorro esta"+dog1.interate("nada"));
            System.out.println("O cachorro esta"+dog1.interate("vai dormir"));
            System.out.println("The dog catch something /n this is"+dog1.Pegar());
}
}
