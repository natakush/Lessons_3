package hw8;

public class myExcep extends RuntimeException {

    public myExcep(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}