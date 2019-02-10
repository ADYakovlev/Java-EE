package com.yakovlev.javee.enterprise;

import java.util.Collection;

/*
@author Yakovlev
*/
public interface CRUDOperations {

    void findAll();

    Collection findByKey(String key);

    void deleteByKey(String key);

    void updateByKey(String key);
}
