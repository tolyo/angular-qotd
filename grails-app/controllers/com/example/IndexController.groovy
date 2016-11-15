package com.example

import groovy.transform.CompileStatic

@CompileStatic
class IndexController {

    def index() {
        render servletContext.getResourceAsStream("/index.html").getText("UTF-8")
    }
}
