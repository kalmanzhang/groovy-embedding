package hello

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Created by oscart on 25-10-2015.
 */
class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class)

    public static final int SLEEP_TIME = 1000

    static void main(args) {
        def binding = new Binding()
        def engine = new GroovyScriptEngine()

        while (true) {
            def greeter = engine.run('hello.ReloadingTest', binding)
            println greeter.sayHello()
            logger.info("Sleep for " + SLEEP_TIME)
            Thread.sleep(SLEEP_TIME)
        }

    }
}

