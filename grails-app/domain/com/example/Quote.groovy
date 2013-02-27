package com.example

class Quote {
	
	String author
	String content
	Date create = new Date()
	
    static constraints = {
		author (blank:false) 
		content(blank:false, maxSize: 1000)
    }
}
