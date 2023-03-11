package com.appsmith.server.repositories.ce;

import com.appsmith.server.domains.ApplicationTemplate;
import com.appsmith.server.domains.CustomJSLib;
import com.appsmith.server.repositories.BaseAppsmithRepositoryImpl;
import com.appsmith.server.repositories.CacheableRepositoryHelper;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.core.query.Criteria;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

public class CustomApplicationTemplateRepositoryCEImpl extends BaseAppsmithRepositoryImpl<ApplicationTemplate> implements CustomApplicationTemplateRepositoryCE {
    private static final String UID_STRING_IDENTIFIER = "uidString";

    public CustomApplicationTemplateRepositoryCEImpl(ReactiveMongoOperations mongoOperations, MongoConverter mongoConverter,
                                                     CacheableRepositoryHelper cacheableRepositoryHelper) {
        super(mongoOperations, mongoConverter, cacheableRepositoryHelper);
    }
}