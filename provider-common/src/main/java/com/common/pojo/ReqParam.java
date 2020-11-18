package com.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReqParam {
    Integer id;
    String name;
    Integer pageSize;
    Integer pageNum;
    Integer type;
    Integer status;
    String startDate;
    String endDate;
    String key;
    String value;
    List<Integer> idList;
    List<String> strList;
}
