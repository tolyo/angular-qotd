package com.example.database

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Quote {

    Quote(){}

    Quote(String author, String content){
        this.author = author
        this.content = content
    }

    String author
    String content
    Date dateCreated
    Date lastUpdated

    static constraints = {
        author      nullable: false, blank: false
        content     nullable: false, blank: false
    }
}