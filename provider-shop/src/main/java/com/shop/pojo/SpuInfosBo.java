package com.shop.pojo;

import com.shop.pojo.generate.SpuInfos;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "idx_spu_infos")
public class SpuInfosBo extends SpuInfos {
}
