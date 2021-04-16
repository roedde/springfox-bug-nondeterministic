package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Concrete2DTO extends AbstractTreeDTO<Concrete2DTO> {

    private String label;
    private String descripition;
}
