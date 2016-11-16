package com.example

import grails.transaction.Transactional

@Transactional
class QuoteService {

    Quote getRandomQuote() {
        List<Quote> quoteList = Quote.list()
        if (quoteList) quoteList.get(new Random().nextInt(quoteList.size()))
    }
}
