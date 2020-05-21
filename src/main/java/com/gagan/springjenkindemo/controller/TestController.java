/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-21 22:48:20
 * @modify date 2020-05-21 22:48:20
 * @desc [description]
 */
package com.gagan.springjenkindemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String showOutput() {
        return "Hello World";
    }

}