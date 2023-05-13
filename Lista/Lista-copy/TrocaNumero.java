/* Crie uma classe java TrocaNumero que contenha um método que receba dois números
NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os dados lidos
forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na ordem NumA = 9 e
NumB = 5.*/

public class TrocaNumero{
    
    public void inverteNum(int num1, int num2){
        int armazena = 0;
        armazena = num1;
        num1 = num2;
        num2 = armazena;
        
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2:" + num2);
    }
    
}