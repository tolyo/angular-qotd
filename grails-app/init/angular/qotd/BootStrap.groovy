package angular.qotd

import com.example.Quote
import grails.compiler.GrailsCompileStatic
import grails.util.Environment
import groovy.util.logging.Slf4j

import javax.servlet.ServletContext

@Slf4j
@GrailsCompileStatic
class BootStrap {

    def init = { ServletContext servletContext ->
        log.info("Starting for ENVIRONMENT: ${Environment.current.name}")


        [   new Quote(
                author: 'Larry Wall',
                content: 'The is more than one method to our madness'
            ),

            new Quote(
                author: 'Chuck Norris',
                content: 'I only use the Roundhouse kick'
            ),

            new Quote(
                author: 'Eric Raymond',
                content: 'Being a social outcast helps you stay concentrated on the really important things, like thinking and hacking'
            )
        ].each { it.save() }

    }
    def destroy = {
    }
}
