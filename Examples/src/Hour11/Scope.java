/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour11;

/**
 *
 * @author Dad
 */
public class Scope {

    int memberVariable;
    
    Scope() {
        memberVariable = 1;
    }
    
    int doSomething( int methodArg ) {
        int methodVar1 = memberVariable;
        int methodVar2 = methodArg;
        
        for ( int index = 0; index < 10; index++ ) {    
            
            int temp = methodVar1 + methodVar2;
            methodVar1 = temp;
        
        } 
            
        return methodVar1;
    }
}
