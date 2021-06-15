package com.codeup.springblog.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {
    @GetMapping("/add/{num1}/plus/{num2}")
    @ResponseBody
    public double add(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2; }

    @GetMapping("/subtract/{num1}/minus/{num2}")
    @ResponseBody
    public double subtract(@PathVariable double num1, @PathVariable double num2) {
        return num2 - num1; }

    @GetMapping("/multiply/{num1}/times/{num2}")
    @ResponseBody
    public double multiply(@PathVariable double num1, @PathVariable double num2) {
        return num1 * num2; }

    @GetMapping("/divide/{a}/by/{b}")
    @ResponseBody
    public double divide(@PathVariable double num1, @PathVariable double num2) {
        return num1 / num2; }
}
