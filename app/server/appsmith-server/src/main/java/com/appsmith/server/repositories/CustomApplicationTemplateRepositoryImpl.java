package com.appsmith.server.repositories;

import com.appsmith.server.repositories.ce.CustomApplicationTemplateRepositoryCE;
import com.appsmith.server.repositories.ce.CustomApplicationTemplateRepositoryCEImpl;
import com.appsmith.server.repositories.ce.CustomJSLibRepositoryCE;
import com.appsmith.server.repositories.ce.CustomJSLibRepositoryCEImpl;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.convert.MongoConverter;

public class CustomApplicationTemplateRepositoryImpl extends CustomApplicationTemplateRepositoryCEImpl implements CustomApplicationTemplateRepositoryCE {
    public CustomApplicationTemplateRepositoryImpl(ReactiveMongoOperations mongoOperations, MongoConverter mongoConverter,
                                                   CacheableRepositoryHelper cacheableRepositoryHelper) {
        super(mongoOperations, mongoConverter, cacheableRepositoryHelper);
    }
}