/**
 * 
 */
package testdemo;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;


/**
 * @author Chris Wash
 *
 */
public class HamcrestTests {
    
    class Pirate {
	Set<String> occupations;
	
	public Pirate() {
	    occupations = new HashSet<String>();
	}
	
	public Set<String> getOccupations() {
	    return this.occupations;
	}
    }
    
    @Test
    public void matchers_should_be_cool() throws Exception {
	
	Pirate blackbeard = new Pirate();
	
	assertThat(blackbeard.getOccupations(), anyOf(hasItem("pirate"),hasItem("captain")));
    }
    

}
