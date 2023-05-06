/* Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e
a multiplicação dos números pares entre 0 e 30.*/

public class Calculadora{
    
    public void somaImpar(){
        int impar = 0,soma =0;
        
        while(impar !=31){
            if(impar %2 !=0){
                soma = soma + impar;
                
                
            }
            impar = impar + 1;
    }
    System.out.println("A soma é:" + soma);
}
    public void multiplicaPar(){
        int par = 2, multiplicacao = 1;
        
        while(par !=31){
            if(par %2 == 0){
                multiplicacao = multiplicacao * par;
        }
        par = par +1;
    }
    System.out.println("A multiplicacao é:" + multiplicacao);
    
}
}
