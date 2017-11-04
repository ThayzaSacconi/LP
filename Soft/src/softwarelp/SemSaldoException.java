package softwarelp;

public class SemSaldoException extends RuntimeException {
     String message = "Saldo insuficiente, tente um valor menor.";
     
    SemSaldoException() {
      super();
    }  
}
