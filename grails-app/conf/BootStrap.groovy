import com.example.Quote

class BootStrap {

    def init = { servletContext ->
		
		new Quote(
			author: 'Larry Wall',
			content: 'The is more than one method to our madness')
			.save()
			
		new Quote(
			author: 'Chuck Norris',
			content: 'I only use the Roundhouse kick')
			.save()
			
		new Quote(
			author: 'Eric Raymond',
			content: 'Being a social outcast helps you stay concentrated on the really important things, like thinking and hacking')
			.save()
		
    }
    def destroy = {
    }
}
