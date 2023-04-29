public class Soma{
    public static void main(String[] args){//metodo que inicia o programa
        //converte os parametros em inteiros e os armazena em a e b
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b; // realiza a soma
        System.out.println("O Resultado da soma é:" + c); //exibe a soma
    }
}