/*Crie uma classe java MaiorNumero que contenha um método que receba dois números
inteiros e imprima o maior entre eles. 
*/


public class MaiorNumero{
    
    
    public int verificaNum(int num1, int num2){
        if(num1 > num2){
            return num1;
            
        }else if(num2 > num1){
            return num2;
            
        }else{
            return 0;
        }
    }
    
}