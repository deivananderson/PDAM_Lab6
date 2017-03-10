package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import co.edu.pdam.eci.persistenceapiintegration.data.NetworkException;

/**
 * Created by estudiante on 3/9/17.
 */

public interface RequestCallback<T> {
    void onSuccess( T response );

    void onFailed( NetworkException e );
}
