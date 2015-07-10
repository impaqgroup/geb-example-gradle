package com.impaqgroup.example.page.module

import geb.Module

class MenuModule extends Module {

    static content = {
        toggle { children("span") }
        links { $('.link-list li a') }
    }
}
