package com.liuke.dao;

import com.liuke.domain.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonMapper {
    List<Person> selectByName(String name);
}
