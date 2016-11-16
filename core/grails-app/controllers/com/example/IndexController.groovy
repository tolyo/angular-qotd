package com.example

import grails.converters.JSON

class IndexController {

    QuoteService quoteService

    def index() {
        render servletContext.getResourceAsStream("index.html").getText("UTF-8")
    }

    def quote() {
        Quote quote =  quoteService.getRandomQuote()
        render([ 'author': quote.author, 'content': quote.content] as JSON)
    }
}
