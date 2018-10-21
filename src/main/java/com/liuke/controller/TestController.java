package com.liuke.controller;

import com.liuke.domain.Person;
import com.liuke.domain.ReturnModel;
import com.liuke.service.IPersonService;
import com.liuke.service.impl.PersonServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
@Api(tags = "测试")
public class TestController {
    @Autowired
    private IPersonService personService;

    @GetMapping("/person")
    @ResponseBody
    public Object person(String name) {
        List<Person> result = personService.selectByName(name);
        return ReturnModel.getInstance(0, "success", result);
    }
}
