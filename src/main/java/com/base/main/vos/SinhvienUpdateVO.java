package com.base.main.vos;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class SinhvienUpdateVO extends SinhvienVO implements Serializable {
    private static final long serialVersionUID = 1L;

}
