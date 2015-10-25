package hello

import hello.featurex.Dependency
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Greeter {

    static final Logger logger = LoggerFactory.getLogger(Greeter.class)

    String sayHello() {
        def greet = new Dependency().message
        logger.debug(greet)
        greet
    }
}
