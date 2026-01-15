package com.ohgiraffers._5_jenkins.service;

import com.ohgiraffers._5_jenkins.dto.CalculatorDto;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public int plusTwoNumbers(CalculatorDto calculatorDto) {
        return calculatorDto.getNum1() + calculatorDto.getNum2();
    }
}
