package org.kie.example1;

import java.io.PrintStream;

import org.kie.KieServices;
import org.kie.runtime.KieContainer;
import org.kie.runtime.KieSession;

public class APIExample1  {
    
    public void go(PrintStream out) {
        KieServices ks = KieServices.Factory.get();        
        KieContainer kContainer = ks.getKieClasspathContainer();
        
        KieSession kSession = kContainer.newKieSession( "ksession1" );
        kSession.setGlobal( "out", out );
        kSession.insert( new Message("Dave", "Hello, HAL. Do you read me, HAL?") );
        kSession.fireAllRules();
    }    
    
    
    public static void main( String[] args ) {
        new APIExample1().go( System.out );
    }

}
