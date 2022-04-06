package com.student.controller;
/* Created by narendra on 17/11/21 */

import com.student.entity.Coffee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiCoffeeController {

    private List<Coffee> coffees = new ArrayList<>();

    public RestApiCoffeeController() {
        coffees.addAll(List.of(
                new Coffee("1", "Café Cereza"),
                new Coffee("2", "Café Ganador"),
                new Coffee("3", "Café Lareño"),
                new Coffee("4", "Café Três Pontas")
        ));
    }

    @RequestMapping(value = "/coffees", method = RequestMethod.GET)
    Iterable<Coffee> getCoffees() {
        return coffees;
    }
}

