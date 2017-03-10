package co.edu.pdam.eci.persistenceapiintegration.data;

/**
 * Created by estudiante on 3/9/17.
 */

public class NetworkException extends Exception {

    public NetworkException(int code, String message, Throwable e){
        super(message);
    }
}
