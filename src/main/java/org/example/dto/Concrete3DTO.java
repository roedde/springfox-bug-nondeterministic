package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Concrete3DTO extends AbstractTreeDTO<Concrete3DTO> {

    private String name;
    private String surname;
    private String address;
}
