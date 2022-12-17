import java.util.Scanner;
public class App { 
    public static void main(String[] args) {
        var teclado = new Scanner (System.in);
        double peso, altura, imc;
        
        System.out.print("Quanto voce pesa? ");
        peso = teclado.nextDouble();
        
        System.out.print("Qual a sua altura? ");
        altura = teclado.nextDouble();
        
        imc = peso / (altura * altura);
        
        if (imc < 20){
        System.out.println("Abaixo do peso");}
        
        if (imc >= 20 && imc < 25){
        System.out.println("Peso normal");}
        
        if (imc >= 25 && imc < 30){
        System.out.println("Sobre peso");}
        
        if (imc >= 30 && imc < 40){
        System.out.println("Obeso");}
        
        if (imc >= 40){
        System.out.println("Obeso morbido");}
        }
}