package angular.qotd

import com.example.Quote
import grails.compiler.GrailsCompileStatic

import javax.servlet.ServletContext

@GrailsCompileStatic
class BootStrap {

    def init = { ServletContext servletContext -> [
        new Quote(
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
        )].each { it.save() }

    }
    def destroy = {
    }
}
