package softwarelp;

import java.util.ArrayList;

public class SoftwareLP {
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();    
    static int MAX = 10;
    
    public static void main(String[] args) {
        Arquivos arq = new Arquivos();
        
        if (clientes.size() > MAX) {
            throw new EstouroTamanhoException("Tamanho insuficiente!");
        } 
        else {
        
            clientes.add(new Cliente("Thayza", "email", "endereco", "prof", "123901", "99699", 'F', "996", "senha", "123456"));
            //clientes.add(new Cliente("ana frávia", "email", "endereco", "prof", "123901", "99699", 'F', "996", "senha", "123456"));
            //clientes.add(new Cliente("ana", "email", "endereco", "prof", "123901", "99699", 'F', "996", "senha", "123456"));

        }
        
        
        new Tela().setVisible(true);
    }
    
}
