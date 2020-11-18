package com.shop.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ParaBean implements Serializable {
    private static final long serialVersionUID = 1L;

    Integer id;
    Integer type;
    Integer status;

    String value;
    String name;
    String startDate;
    String endDate;
    String key;
    String remark;

    List<?> list;
}