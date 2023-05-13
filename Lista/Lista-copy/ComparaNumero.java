/* Crie uma classe java ComparaNumero que contenha um método que receba dois
números e indique se são iguais ou se são diferentes. Mostre o maior e o menor (nesta
sequência).*/

public class ComparaNumero{
    
    public void comparaNumero(int num1, int num2){
        if(num1 == num2){
            System.out.println("Os numeros são iguais");
            
        }else{
            if(num1 > num2){
                System.out.println("O número 1 é maior: " + num1);
                
            }else{
                System.out.println("O número 2 é maior: " + num2);
            }
        }
    }
    
    
}