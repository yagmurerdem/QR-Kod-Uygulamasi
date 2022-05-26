package tr.com.cinigaz.result;
//işlem sonucu başarılı ise
public class SuccessResult extends Result {
    public SuccessResult() {
        super(true);
    }

    public SuccessResult(String message) {
        super(true, message);
    }
}
