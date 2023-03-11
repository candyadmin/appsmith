package com.appsmith.server.repositories;

import com.appsmith.server.domains.ApplicationTemplate;
import com.appsmith.server.domains.CustomJSLib;
import com.appsmith.server.repositories.ce.CustomApplicationTemplateRepositoryCE;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationTemplateRepository extends CustomApplicationTemplateRepositoryCE, BaseRepository<ApplicationTemplate, String>  {
}
