public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public double getTotalFatura() {
        double total = quantidade * preco;
        
        if (total < 0) {
            total = 0;
        }
        
        if (preco < 0) {
            preco = 0.0;
        }
        
        return total;
    }
    
    // getters e setters omitidos para brevidade
}