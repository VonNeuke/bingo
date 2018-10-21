package com.liuke.service;

import com.liuke.domain.Person;

import java.util.List;

public interface IPersonService {

    public List<Person> selectByName(String name);
}
