/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcb.ambienta.ambientaapp.service;


import com.bcb.ambienta.ambientaapp.dominio.Prueba;
import com.google.inject.Inject;
import javax.annotation.PostConstruct;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 *
 * @author BRENDA
 */
@Service
public class SistemaExpertoServiceImpl implements SistemaExpertoService{
     @Inject 
    ApplicationContext context; 

    StatelessKieSession kieSession; 
    KieBase kieBase; 

    @PostConstruct 
    public void postConstruct(){ 
        kieSession = (StatelessKieSession) context.getBean("ambientaKS"); 
        kieBase = (KieBase) context.getBean("ambientaKS"); 
        System.out.println("kieBase == "+kieBase ); 
        System.out.println("kieSession == "+kieSession); 
    }
        
    @Override
    public String pruebaRespuesta() {
          //StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession)applicationContext.getBean("ambientaKS");

//KieSession ksession = kbase.newKieSession();
//        Prueba p=new Prueba();
//        p.setBalance(50);
//        KieServices ks = KieServices.Factory.get();
//        KieContainer kieContainer = ks.getKieClasspathContainer();
        // Get the session named kseesion-rule that we defined in
        // kmodule.xml above.
        // Also by default the session returned is always stateful.
        //KieSession kSession = kContainer.newKieSession("ambientaKS");
        //KieSession kSession = kContainer.newKieSession("ambientaKS");
//        StatelessKieSession courseMatchSession = kieContainer.newStatelessKieSession();
        
        //kSession.insert(p);
        //int i=kSession.fireAllRules();
        
        
        return "holi";
    }    
    
}
