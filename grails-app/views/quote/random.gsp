<html>
	<head>
	<meta name='layout' content='quoteLayout'>
	</head>
</html>
<body>
	<div id="quote">
		This is the random quote of the day:
		<table id="quoteTable" class="table">
			<tr>
				<td>${quote.author}</td>
				<td>${quote.content}</td>
			</tr>
		</table>
	</div>
	<div>
		<g:remoteLink action="ajaxRandom" update="quoteTable">
			Next quote
		</g:remoteLink>
	</div>
</body>
