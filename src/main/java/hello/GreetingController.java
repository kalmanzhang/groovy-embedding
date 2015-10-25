package hello;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting" ,method = RequestMethod.GET)
    @ResponseBody
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) throws Exception {
        GroovyScriptEngine engine = new GroovyScriptEngine("src\\main\\groovy\\hello");
        Binding binding = new Binding();
        Object greeter = engine.run("ReloadingTest.groovy", binding);
        return ((String) greeter);
    }

}