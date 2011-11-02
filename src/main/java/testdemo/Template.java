/**
 * 
 */
package testdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris Wash
 *
 */
public class Template {

    String template;
    Map<String, String> variables;
    
    /**
     * @param string
     */
    public Template(String template) {
	this.template = template;
	this.variables = new HashMap<String, String>();
    }

    /**
     * @param string
     * @param string2
     */
    public void setVariable(String variableName, String variableValue) {
	this.variables.put(variableName, variableValue);
    }

    /**
     * @return
     */
    public String evaluate() {
	String eval = template;
	
	for (String variableName : variables.keySet()) {
		String regex = String.format("\\$\\{%s\\}", variableName);
		eval = eval.replaceAll(regex, variables.get(variableName));
    	}
	
	return eval;
	
    }

}
