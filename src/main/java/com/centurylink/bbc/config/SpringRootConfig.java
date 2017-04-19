package com.centurylink.bbc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.centurylink.bbc.service" })
public class SpringRootConfig {
}