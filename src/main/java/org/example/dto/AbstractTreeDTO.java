package org.example.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AbstractTreeDTO <DTO extends AbstractTreeDTO<DTO>> extends AbstractBaseDTO {

    @JsonBackReference
    private DTO parent;
    @JsonManagedReference
    private List<DTO> children;

    boolean leaf;

}
