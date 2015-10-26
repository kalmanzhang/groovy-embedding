package hello;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.util.GroovyScriptEngine;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
public class GreetingController {
    /**
     * Example using the GroovyScriptEngine, to run a script
     * @param name
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/greeting1" ,method = RequestMethod.GET)
    @ResponseBody
    public String greeting1(@RequestParam(value="name", required=false, defaultValue="World") String name) throws Exception {
        GroovyScriptEngine engine = new GroovyScriptEngine("src\\main\\groovy");
        Binding binding = new Binding();
        Object greeter = engine.run("hello/SampleScript.groovy", binding);
        return ((String) greeter);
    }

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/greeting2" ,method = RequestMethod.GET)
    @ResponseBody
    public String greeting2(@RequestParam(value="name", required=false, defaultValue="World") String name) throws Exception {
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        groovyClassLoader.clearCache();
        Class aClass = groovyClassLoader.parseClass(new File("src\\main\\groovy\\hello\\Greeter.groovy"));
        IGreeter  greeter = (IGreeter) aClass.newInstance();
        return greeter.sayHello();
    }

}