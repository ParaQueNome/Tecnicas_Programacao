
/**
 * Escreva uma descrição da classe casa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class casa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int sala, quarto, cozinha, banheiro;

    /**
     * Construtor para objetos da classe casa
     */
    public casa(int sala, int quarto, int cozinha, int banheiro)
    {
        // inicializa variáveis de instância
        this.sala=sala;
        this.quarto = quarto;
        this.cozinha = cozinha;
        this.banheiro= banheiro;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        // escreva seu código aqui
        System.out.println("A casa possui:");
        System.out.println("Quartos:" +quarto);
        System.out.println("Sala:" +sala);
        System.out.println("Cozinha:" +cozinha);
        System.out.println("Banheiro:" +banheiro);
        

        
    }
}
