package softwarelp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivos {  

    public void salvarEmDisco(ArrayList<Cliente> clientes) {
        File arquivo = new File("clientes.dat");

        try {
            FileOutputStream filo = new FileOutputStream(arquivo);
            ObjectOutputStream obj = new ObjectOutputStream(filo);

            obj.writeObject(clientes); 

            obj.flush();
            obj.close();
            filo.close();

        } catch(Exception ex) {
            System.err.println("ERRO: " + ex.toString());
        }
    }
    
    /*public void lerDoDisco() {
        File arquivo = new File("clientes.dat");

        try {
            FileInputStream f = new FileInputStream(arquivo);
            ObjectInputStream oi = new ObjectInputStream(f);

            //this.clientes = (Cliente[])oi.readObject();

            oi.close();
            f.close();

            for(Cliente c : this.clientes) {
                //c.imprimir();
            }
        } catch(Exception ex) {
            System.err.println("ERRO: " + ex.toString());
        }
    }*/
    
}
