package com.appsmith.server.domains;

import com.appsmith.external.models.BaseDomain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Document
public class PageNameId  extends BaseDomain {
    String id;

    String name;

    String slug;

    String customSlug;

    Boolean isDefault;

    Boolean isHidden;

    // This field will represent the default pageId for current page in git system where we are connecting resources
    // among the branches
    @JsonIgnore
    String defaultPageId;
}
