/**
 * 
 */
package testdemo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;



public class TemplateTest {

    
    @Test
    public void should_evaluate_one_variable() {
	
	// arrange
	Template test = new Template("Hello, ${name}");
	test.setVariable("name", "Reader");
	
	// act
	String result = test.evaluate();
	
	// assert
	assertThat(result, is("Hello, Reader"));
	
	
    }
    
    
    @Test
    public void should_evaluate_another_variable() {
	
	// arrange
	Template test = new Template("Hi, ${name}");
	test.setVariable("name", "Reader");
	
	// act
	String result = test.evaluate();
	
	// assert
	assertThat(result, is("Hi, Reader"));
	
	
    }
    
    
    @Test
    public void should_evaluate_two_variables() {
	
	Template test = new Template("${greeting}, ${name}");
	test.setVariable("greeting", "Hi");
	test.setVariable("name", "Reader");
	
	String result = test.evaluate();
	
	assertThat(result, is("Hi, Reader"));
	
    }

    
    @Test
    public void test_string_format() {
	String test = String.format("%s", "replace");
	assertThat(test, is("replace"));
    }
    
    
}
