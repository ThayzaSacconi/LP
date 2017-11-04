package softwarelp;

public class Cliente extends Pessoa {
    int idCod = 1;
    String senha, numConta;
    double pontuacao, saldoCliente;
    
    public Cliente(String nome, String email, String profissao, 
            String CPF, String telefone, String sexo, String dataNasc, String senha,
            String numConta, Double saldoCliente) {
        super(nome, email, profissao, CPF, telefone, sexo, dataNasc);
        this.idCod++;
        this.senha = senha;
        this.numConta = numConta;
        this.saldoCliente = saldoCliente;
    }

    // --------------------- get e set de senha do cliente
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    // --------------------- get e set de número de conta
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public int getIdCod() {
        return idCod;
    }

    public void setIdCod(int idCod) {
        this.idCod = idCod;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }
    
    // --------------------- métodos de atividades possíveis para o cliente realizar no sistema do banco
    public void depositar(double valor) { 
        this.saldoCliente += valor;       
    }
    
    public void sacar(double valor) {
        if (this.saldoCliente < valor) {
            throw new SemSaldoException();
        } 
        else 
            this.saldoCliente-=valor;
    }
    
}