package core

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "index")
        "/quote"(controller: "index", action: "quote")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
