package com.base.main.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class SinhvienDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String name;

    private String lop;

    private Integer tuoi;

}
