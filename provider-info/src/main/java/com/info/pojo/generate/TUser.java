package com.info.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser implements Serializable {
    private String fdId;

    private String fdName;

    private String fdNo;

    private static final long serialVersionUID = 1L;
}