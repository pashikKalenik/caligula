package com.comelfo.caligula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller // Программный модуль
public class GreetingController {

    @GetMapping("/greeting") // Контроллер, который по указанному пути "/greeting" слушает запросы пользователей и возвращает данные
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           @RequestParam(name="age", required=false, defaultValue="0") int age,
                           Map<String, Object> model) {

        model.put("name", name);
        model.put("age", age);
        return "greeting"; // возвращаем файл шаблона. Коллекция мапится на соот-ие тэги

    }

    @GetMapping // Контроллер, который по указанному пути "корень" слушает запросы пользователей и возвращает данные
    public String main(@RequestParam(name="some1", required=false, defaultValue="empty1") String some1,
                       @RequestParam(name="some2", required=false, defaultValue="empty2") String some2,
                       Map<String, Object> model) {

        model.put("some1", some1);
        model.put("some2", some2);
        return "main"; // возвращаем файл шаблона. Коллекция мапится на соот-ие тэги

    }

}