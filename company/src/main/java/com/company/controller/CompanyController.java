package com.company.controller;

import com.company.model.Company;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Description:
 * Author: masong
 * Date: 2017/3/24 13:59
 * Version: v1.0
 */
@RestController
public class CompanyController {

    @RequestMapping("/company/{id}")
    public Company getCompanyById(@PathVariable("id") Long id) {
        sleep();
        return new Company(1L, "Company");
    }

    //利用时间等待模拟Serivce调用时长
    private void sleep() {
        Random rand = new Random();
        int time = rand.nextInt(2000);

        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
