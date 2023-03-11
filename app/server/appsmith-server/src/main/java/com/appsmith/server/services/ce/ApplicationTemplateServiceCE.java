package com.appsmith.server.services.ce;

import com.appsmith.server.domains.ApplicationTemplate;
import com.appsmith.server.dtos.ApplicationImportDTO;
import com.appsmith.server.dtos.ApplicationTemplateDTO;
import com.appsmith.server.services.CrudService;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApplicationTemplateServiceCE extends CrudService<ApplicationTemplate, String> {

    Mono<List<ApplicationTemplateDTO>> getActiveTemplates(List<String> templateIds);

    Flux<ApplicationTemplateDTO> getSimilarTemplates(String templateId, MultiValueMap<String, String> params);

    Mono<List<ApplicationTemplateDTO>> getRecentlyUsedTemplates();

    Mono<ApplicationTemplateDTO> getTemplateDetails(String templateId);

    Mono<ApplicationImportDTO> importApplicationFromTemplate(String templateId, String workspaceId);

    Mono<ApplicationImportDTO> mergeTemplateWithApplication(String templateId, String applicationId, String workspaceId, String branchName, List<String> pagesToImport);

    Mono<ApplicationTemplateDTO> getFilters();
}
