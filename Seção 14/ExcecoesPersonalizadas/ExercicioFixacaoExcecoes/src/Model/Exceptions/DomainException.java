package Model.Exceptions;

public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;
    // versão de serialização (mais atual --> eu acho kk)

    public DomainException(String msg) {
        super(msg);
    }
}
