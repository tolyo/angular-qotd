package com.example



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteTests {

    void testSomething() {
       Quote quote = new Quote()
       assert quote.validate() == false
    }
}
