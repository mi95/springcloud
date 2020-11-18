package com.search.pojo;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "user")
public class UserInfosBo {
    private Integer id;
    private String name;
}
