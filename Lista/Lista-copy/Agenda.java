public class Agenda {
    private Contato[] contatos;
    private int numContatos;
    
    public Agenda(int tamanho) {
        this.contatos = new Contato[tamanho];
        this.numContatos = 0;
    }
    
    public boolean adicionarContato(Contato contato) {
        if (numContatos >= contatos.length) {
            return false; // não há espaço na agenda
        }
        contatos[numContatos] = contato;
        numContatos++;
        return true;
    }
    
    public Contato buscarContato(String nome) {
        for (int i = 0; i < numContatos; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return contatos[i];
            }
        }
        return null; // contato não encontrado
    }
    
    public boolean excluirContato(String nome) {
        for (int i = 0; i < numContatos; i++) {
            if (contatos[i].getNome().equals(nome)) {
                // desloca os contatos à direita do contato a ser excluído
                for (int j = i; j < numContatos - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[numContatos - 1] = null;
                numContatos--;
                return true;
            }
        }
        return false; // contato não encontrado
    }
}