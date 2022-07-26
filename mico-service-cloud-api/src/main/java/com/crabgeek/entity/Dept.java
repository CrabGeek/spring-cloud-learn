package com.crabgeek.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: eurekademo
 * @description:
 * @author: Guipeng.Xie
 * @create: 2022-06-05 21:13
 */

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;

}
