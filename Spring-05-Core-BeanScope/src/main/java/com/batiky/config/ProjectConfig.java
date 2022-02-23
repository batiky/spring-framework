package com.batiky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.batiky")
@ComponentScan(basePackages = {"com.batiky.proxy", "com.batiky.service", "com.batiky.repository"})
public class ProjectConfig {
}
