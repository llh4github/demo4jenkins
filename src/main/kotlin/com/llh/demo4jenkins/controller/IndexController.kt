package com.llh.demo4jenkins.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import java.time.LocalDateTime

/**
 *
 * <p>Created At 2021/1/16 09:14
 * @author llh
 */
@Controller
@RequestMapping(value = ["", "/"])
class IndexController {

    @GetMapping(value = ["", "home"])
    fun home(mv: ModelAndView): ModelAndView {

        mv.addObject("date", LocalDateTime.now())
        mv.viewName = "index"
        return mv
    }
}