package org.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AbstractBaseDTO implements Serializable {

    private Long id;
}
