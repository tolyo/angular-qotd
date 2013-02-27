package com.example

import static org.junit.Assert.*
import org.junit.*

class QuoteServiceIntegrationTests {
	
	def quoteService

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testRandomQuote() {
		assertNotNull(quoteService.getRandom())
    }
}
