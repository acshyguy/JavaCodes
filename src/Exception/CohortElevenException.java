package Exception;
// How to create our own Exception
// We can create no Args,Required Args... (4 types of constructor)
// then call the constructor of the Superclass

public class CohortElevenException extends RuntimeException {
    // first constructor from the superclass
    public CohortElevenException(){
        super();
    }
    // second constructor
    public CohortElevenException(String message){
        super(message);
    }
    // Third constructor
    public CohortElevenException(Throwable ex){
        super(ex);
    }
    // Fourth constructor
    public CohortElevenException(String message, Throwable ex){
        super(message,ex);
    }


}
