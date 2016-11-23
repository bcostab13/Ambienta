/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcb.ambienta.ambientaapp.config;

import java.io.IOException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author BRENDA
 */

@Configuration
public class RulesConfig {

    @Bean
    public KieContainer kieContainer() throws IOException {
        KieServices ks = KieServices.Factory.get();
        return ks.getKieClasspathContainer();
    }
}