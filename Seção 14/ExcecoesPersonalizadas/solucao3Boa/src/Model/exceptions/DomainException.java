package Model.exceptions;

// Exception são aquelas que o commpilador te obriga a tratar
// runtime exception são as que o programador tem que tratar

public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;
    // versão de serialização (mais atual --> eu acho kk)

    public DomainException(String msg) {
        super(msg);
    }


}
