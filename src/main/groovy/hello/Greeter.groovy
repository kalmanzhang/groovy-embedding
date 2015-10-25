package hello

import hello.featurex.Dependency
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Greeter implements IGreeter {

    static final Logger logger = LoggerFactory.getLogger(Greeter.class)

    String sayHello() {
        def greet = new Dependency().message
        logger.debug(greet)
        greet
    }
}
