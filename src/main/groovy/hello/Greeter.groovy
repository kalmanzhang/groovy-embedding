package hello

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Created by oscart on 25-10-2015.
 */
class Greeter {

    static final Logger logger = LoggerFactory.getLogger(Greeter.class)

    String sayHello() {
        def greet = new Dependency().message
        logger.debug(greet)
        greet
    }
}
