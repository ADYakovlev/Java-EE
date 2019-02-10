package com.yakovlev.javee;

import jdk.internal.jline.internal.Nullable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;
import java.util.List;

/*
@author Yakovlev
*/
public class AbstractRepository {
    @PersistenceContext (name="example-persistence-unit")
    EntityManager em;

    @Nullable
    <T> T getEntity(@NotNull final TypedQuery<T> query){
        final List<T> resultList = query.getResultList();
        if(resultList.isEmpty())return null;
        return resultList.get(0);
    }
}
