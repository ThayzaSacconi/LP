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
        
              }
        
        
        new Tela().setVisible(true);
    }
    
}
