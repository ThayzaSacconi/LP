package softwarelp;

public class Cliente extends Pessoa {
    int idCod = 1;
    String senha, numConta;
    double pontuacao;
    
    public Cliente(String nome, String email, String endereco, String profissao, 
            String CPF, String telefone, char sexo, String dataNasc, String senha,
            String numConta) {
        super(nome, email, endereco, profissao, CPF, telefone, sexo, dataNasc);
        this.idCod++;
        this.senha = senha;
        this.numConta = numConta;
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
    
    // --------------------- método para imprimir os dados do cliente do arquivo
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Senha: " + this.senha);
        System.out.println("Num da conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldoCliente);
    }
    
    // --------------------- métodos de atividades possíveis para o cliente realizar no sistema do banco
    double saldoCliente;
    public void depositar(double valor) { 
        this.saldoCliente += valor;       
    }
    
    public void sacar(double valor) {
        if (this.saldoCliente < valor) {
            throw new SemSaldoException("Saldo insuficiente, tente um valor menor.");
        } 
        else 
            this.saldoCliente-=valor;
    }
    
}