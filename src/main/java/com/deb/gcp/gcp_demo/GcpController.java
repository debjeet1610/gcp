package com.deb.gcp.gcp_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GcpController {

    @GetMapping("/hello")
    public String printString() {
        return "GCP controller";
    }
}
