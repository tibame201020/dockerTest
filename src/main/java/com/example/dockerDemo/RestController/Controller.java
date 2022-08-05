package com.example.dockerDemo.RestController;

import com.example.dockerDemo.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private ItemRepo itemRepo;

    @RequestMapping("hello")
    public List<Map<String, Object>> hello() {
        itemRepo.insertItem();

        return itemRepo.getAllItem();
    }


}
