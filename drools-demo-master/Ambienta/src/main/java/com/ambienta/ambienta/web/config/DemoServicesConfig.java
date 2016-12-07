package com.ambienta.ambienta.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ambienta.ambienta.rules.DemoKieConfig;

@Configuration
@Import(DemoKieConfig.class)
@ComponentScan("com.ambienta.ambienta.services")
public class DemoServicesConfig {

}
