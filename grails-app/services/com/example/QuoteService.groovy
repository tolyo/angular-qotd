package com.example

class QuoteService {
	
	boolean transactional = true

    def getRandom() {
		Quote.list().get(new Random().nextInt(Quote.count()))
    }
}
