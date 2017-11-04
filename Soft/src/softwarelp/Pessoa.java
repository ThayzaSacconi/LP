package softwarelp;

public class Pessoa {
    String nome, email, profissao, CPF, telefone, dataNasc, sexo;
    
    public Pessoa(String nome, String email, String profissao, 
                   String CPF, String telefone, String sexo, String dataNasc) {
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
        this.CPF = CPF;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
    }

    // --------------------- get e set de nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // --------------------- get e set de e-mail
    public String getEmail() {    
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // --------------------- get e set de profissão
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    } 
    
    // --------------------- get e set de CPF
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    // --------------------- get e set de telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // --------------------- get e set de sexo
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // --------------------- get e set da data do nascimento
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    // --------------------- método para imprimir os dados do cliente do arquivo
   /* public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Número do CPF: " + this.CPF);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Data de nascimento: " + this.dataNasc);
    }*/
}
