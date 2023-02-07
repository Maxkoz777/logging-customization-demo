package com.example.loggingcustomizationdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogGenerator {

    @Scheduled(fixedRate = 1000L)
    public void generateGeneralLogs() {
        log.trace("info level log");
        log.debug("debug level log");
        log.info("info level log");
        log.warn("warn level log");
    }

    @Scheduled(fixedRate = 1000L)
    public void generateErrorLogs() {
        log.error("error level log");
    }

}
