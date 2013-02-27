<html>
	<head>
		<title>Random quote</title>
		<link rel="stylesheet" href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css">
		<style>
	      body {
	        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
	      }
	    </style>
	</head>
	<g:layoutHead/>
	<r:require module="jquery"/>
	<r:layoutResources/>
</html>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">Quote project</a>
        </div>
      </div>
    </div>

    <div class="container">
		<g:layoutBody/>
    </div> <!-- /container -->
	<r:layoutResources/>
</body>
