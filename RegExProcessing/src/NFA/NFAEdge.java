/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor'  */
package NFA;

import PCRE.PcreRule;
import PCRE.Refer;

/**
 *
 * @author Hoang Long Le
 */
public class NFAEdge {
    // two node of the edge
    public NFAState srcState = null;
    public NFAState dstState = null;
    // Indicate value of edge.
    public boolean isEpsilon = true;        // if not epsilon
    public String value = null;             //  value will have a value.
    public int id = -1;                          // PCRE.refer
    // include for manage constraint repetiton operator.
    public boolean isConRep= false;

    
    NFAEdge() {
        //todo 
    }
}
