class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		
		"/random"(uri: "/index.html")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
