/*Crie uma classe MediaAluno que contenha um atributo do tipo vetor de inteiros com o
nome de notas. Essa classe deve ter um método para adicionar as notas nesse vetor (os
valores que podem ser adicionados no vetor são os inteiros entre 0 e 100, caso contrário
imprime uma mensagem de erro e não adiciona) e outro método que calcule a média
de um aluno e imprima essa média. */

import java.util.Scanner;


public class MediaAluno{
    private int vetor[]; // Declaracao de vetor
    
    
    public MediaAluno(){
        
        System.out.println("Insira o tamanho do vetor");
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        
        this.vetor = new int[numero];
    }
    public void adicionaNota(){
        int tamanho = this.vetor.length;
        for(int i = 0; i < tamanho; i++){
            System.out.println("Insira a nota do aluno");
            Scanner ler = new Scanner(System.in);
            int numero = ler.nextInt();
            this.vetor[i] = numero;
           
            
        }
        
    }
    public void calculaMedia(){
        
        int tamanho = this.vetor.length;
        int media = 0, soma = 0;
        for(int i = 0; i < tamanho; i++){
            soma = this.vetor[i] + soma;
            
            
        }
        media = soma/tamanho;
        System.out.println("A media é:" + media);
    }
    
}