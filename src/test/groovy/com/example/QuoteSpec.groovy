package com.example

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    Quote quote

    def setup() {
    }

    def cleanup() {
    }

    void "test validate"() {
        when: "invalid"
        quote = new Quote()

        then:"should fail"
        quote.validate() == false

        when: "valid"
        quote = new Quote("Author", "Content")
        quote.validate()
        quote.errors.allErrors.each {println it}
        then: "should succeed"
        quote.validate() == true
    }
}
