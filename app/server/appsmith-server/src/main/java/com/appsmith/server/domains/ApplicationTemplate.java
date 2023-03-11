package com.appsmith.server.domains;

import com.appsmith.external.models.BaseDomain;
import com.appsmith.server.dtos.CustomJSLibApplicationDTO;
import com.appsmith.server.dtos.PageNameIdDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.querydsl.core.annotations.QueryEntity;
import lombok.*;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.appsmith.server.constants.ResourceModes.EDIT;
import static com.appsmith.server.constants.ResourceModes.VIEW;
import static com.appsmith.server.helpers.DateUtils.ISO_FORMATTER;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Document
public class ApplicationTemplate extends BaseDomain {
    private String title;
    private String description;
    private String appUrl;
    private String appDataUrl;
    private String gifUrl;
    private String productImageUrl;
    private String sortPriority;
    private List<String> screenshotUrls;
    private List<String> widgets;
    private List<String> functions;
    private List<String> useCases;
    private List<String> datasources;
    private List<PageNameId> pages;
    private String minVersion;
    private String minVersionPadded;
    private Long downloadCount;
    private Object appData;
    private Boolean active;


}
