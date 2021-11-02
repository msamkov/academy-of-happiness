package ru.multicon.academyofhappiness.controller;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class MonitoringController {

    private final BuildProperties buildProperties;

    public MonitoringController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping(value = "/api/v1/monitoring/ping")
    public void ping() {
    }

    @GetMapping(value = "/api/v1/monitoring/date")
    public ZonedDateTime date() {
        return ZonedDateTime.now();
    }

    @GetMapping(value = "/api/v1/version")
    public String version() {
        return buildProperties.getVersion();
    }

}
