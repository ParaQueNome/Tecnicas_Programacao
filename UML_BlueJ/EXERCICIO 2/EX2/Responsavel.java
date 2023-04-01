
/**
 * Escreva uma descrição da classe Responsavel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Responsavel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String parentesco;
    private int tel_residencial;
    private int tel_celular;
    private String endereco_responsavel;

    /**
     * Construtor para objetos da classe Responsavel
     */
    public Responsavel(String parentesco, int tel_resicencial, int tel_celular, String endereco_responsavel)
    {
        // inicializa variáveis de instância
        this.parentesco = parentesco;
        this.tel_residencial = tel_residencial;
        this.tel_celular = tel_celular;
        this.endereco_responsavel = endereco_responsavel;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInfoResp()
    {
        // escreva seu código aqui
        System.out.println("Informações do responsavel");
        System.out.println("Parentesco:" + parentesco);
        System.out.println("Telefone residencial: " + tel_residencial);
        System.out.println("Telefone celular: " + tel_celular);
        System.out.println("Endereco do responsavel: " + endereco_responsavel);
        
    }
}
