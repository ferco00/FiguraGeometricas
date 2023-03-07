package com.mycompany.figurasgeometricas;
import java.util.Scanner;
public class FigurasGeometricas {
double area;
public void circulo(){
    Scanner entrada = new Scanner (System.in);
    float r;
    double pi;
    r=0;
    pi=3.1416;
    System.out.println("¿Cual es el radio de tu circulo?"); 
    r=entrada.nextInt();       
    area=pi*(r*r);
    System.out.println("El area de tu circulo es: "+area);
}
public void cuadrado(){
    Scanner entrada = new Scanner (System.in);
    float l1;
    l1=0;
    System.out.println("¿Cual es el lado de tu cuadrado?");
   l1=entrada.nextInt();       
    area=l1*l1;
    System.out.println("El area de tu cuadrado es: "+area);
}
public void triangulo(){
    Scanner entrada = new Scanner (System.in);
    float b;
    float h;
    b=0;
    h=0;
    System.out.println("¿Cual es la base de tu triangulo?");
    b=entrada.nextInt();  
    System.out.println("¿Cual es la altura de tu triangulo?");
    h=entrada.nextInt();  
    area=(b*h)/2;
    System.out.println("El area de tu triangulo es; "+area);
}
public void rectangulo(){
    Scanner entrada = new Scanner (System.in);
    float l1;
    float l2;
    l1=0;
    l2=0;   
    System.out.println("¿Cual es el lado 1 de tu rectangulo?");
   l1=entrada.nextInt();  
    System.out.println("¿Cual es el lado 2 de tu rectangulo?");
   l2=entrada.nextInt();  
    area=l1*l2;   
    System.out.println("El area de tu triangulo es; "+area);    
}
public void esfera (){
    Scanner entrada = new Scanner (System.in);
    float r;
    double pi;
    r=0;
    pi=3.1416;
    System.out.println("¿Cual es el radio de tu esfera?");  
    r=entrada.nextInt();       
    area=(4*pi)*(r*r);
    System.out.println("El area de tu esfera es: "+area);
}
public void cubo(){
    Scanner entrada = new Scanner (System.in);
    float l;
    l=0;
    System.out.println("¿Cual es el lado de tu cubo?");
    l=entrada.nextInt();       
    area=6*(l*l);
    System.out.println("El area de tu cubo es: "+area);
}

    public static void main(String[] args) {
    FigurasGeometricas resultadoC = new FigurasGeometricas();
    resultadoC.circulo();
    FigurasGeometricas resultadoCU= new FigurasGeometricas();
    resultadoCU.cuadrado();
    FigurasGeometricas resultadoT = new FigurasGeometricas();
    resultadoT.triangulo();
    FigurasGeometricas resultadoR = new FigurasGeometricas();
    resultadoR.rectangulo();
    FigurasGeometricas resultadoE = new FigurasGeometricas();
    resultadoE.esfera();
    FigurasGeometricas resultadoCB= new FigurasGeometricas();
    resultadoCB.cubo();
    }
}
