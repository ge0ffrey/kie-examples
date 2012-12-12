package org.kie.example2;

import org.kie.builder.KieContainer;
import org.kie.builder.KieServices;
import org.kie.runtime.KieSession;

import org.kie.example1.Message;

/**
 * Hello world!
 *
 */
public class APIExample2 
{
    public static void main( String[] args )
    {
        KieServices ks = KieServices.Factory.get();        
        KieContainer kContainer = ks.newKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession( "ksession2" );
        
        kSession.insert( new Message("Dave", "Hello, HAL. Do you read me, HAL?") );
        kSession.fireAllRules();
        
        kSession.insert( new Message("Dave", "Open the pod bay doors, HAL.") );
        kSession.fireAllRules();
    }

}
