package tr.com.cinigaz.exception;

public class ParaNotFound extends RuntimeException{
    private static final long serialVersionUID=1L;
    public ParaNotFound(String message){
        super(message);
    }
}
