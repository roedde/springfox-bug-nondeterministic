package org.example.controller;

import io.swagger.annotations.Api;
import org.example.dto.ReturnDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"ProductSync"})
public class RestEndpoint {

    @GetMapping("/getObject")
    public ReturnDTO getObject() {
        return new ReturnDTO();
    }
}
