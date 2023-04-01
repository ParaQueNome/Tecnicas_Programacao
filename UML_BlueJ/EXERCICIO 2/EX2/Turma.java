import java.util.Date;

/**
 * Escreva uma descrição da classe Turma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Turma
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int num_sala;
    private int cod;
    private Date ano;
    
    

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma(int num_sala, int cod, Date ano)
    {
        // inicializa variáveis de instância
        this.num_sala = num_sala;
        this.cod = cod;
        this.ano = ano;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInfoTurma()
    {
        // escreva seu código aqui
        System.out.println("Informações da turma");
        System.out.println("Numero da Sala:" + num_sala);
        System.out.println("Codigo da Sala:  " + cod);
        System.out.println("Ano da turma:  " + ano);
        
    }
}
