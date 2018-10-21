package com.liuke.service.impl;

import com.liuke.dao.PersonMapper;
import com.liuke.domain.Person;
import com.liuke.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
    private PersonMapper personMapper;

    @Autowired
    private void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> selectByName(String name) {
        return personMapper.selectByName(name);
    }
}
