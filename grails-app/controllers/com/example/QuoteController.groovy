package com.example

import com.example.Quote;
import grails.converters.JSON

class QuoteController {
	
	static scaffold = true
	
	def quoteService

	def random() {
		[quote: quoteService.getRandom()]
	}
	
	def ajaxRandom() {
		Quote quote = quoteService.getRandom()
		render 	"""
					<tr>
						<td>${quote.author}</td>
						<td>${quote.content}</td>
					</tr>
				"""
	}
	
	def jsonRandom() {
		Quote quote = quoteService.getRandom()
		render quote as JSON
	}
}
