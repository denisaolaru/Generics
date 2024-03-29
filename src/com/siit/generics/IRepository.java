package com.siit.generics;

import java.util.Set;

public interface IRepository<T> {
    void save ( T obj );

    void remove ( T obj );

    int count ();

    Set<T> listAll ();
}
