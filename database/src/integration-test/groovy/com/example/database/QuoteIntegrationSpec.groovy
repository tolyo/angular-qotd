package com.example.database


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class QuoteIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test bootstrap"() {
        expect:"instances to be saved"
        Quote.list().size() > 0
    }
}