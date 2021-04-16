package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Concrete1DTO extends AbstractTreeDTO<Concrete1DTO> {

    private String name;
}
