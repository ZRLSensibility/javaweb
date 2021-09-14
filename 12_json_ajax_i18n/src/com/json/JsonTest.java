package com.json;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZRL
 * @create 2021-09-08 10:10
 */
public class JsonTest {
    @Test
    public void test1(){
        Person person = new Person(1,"张瑞龙");
        Gson gson = new Gson();
        String s = gson.toJson(person);
        System.out.println(s);

        Person person1 = gson.fromJson(s, Person.class);
        System.out.println(person1);

    }


    @Test
    public void test2(){

        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"zrl"));
        list.add(new Person(2,"lyp"));

        Gson gson = new Gson();
        String s = gson.toJson(list);
        System.out.println(s);

//        List<Person> list1 = gson.fromJson(s, new PersonListType().getType());
        List<Person> list1 = gson.fromJson(s,new TypeToken<ArrayList<Person>>(){}.getType());
        System.out.println(list1);
    }

    @Test
    public void test3(){
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person(1,"zrl"));
        map.put(2,new Person(2,"lyp"));

        Gson gson = new Gson();
        String mapString = gson.toJson(map);
        System.out.println(mapString);

        Map<Integer,Person> personMap = gson.fromJson(mapString, new TypeToken<HashMap<Integer, Person>>() {
        }.getType());
        System.out.println(personMap);

        Person person = personMap.get(1);
        System.out.println(person);
    }
}
