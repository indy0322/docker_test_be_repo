package com.docker.test.docker_test_repo.service;


import com.docker.test.docker_test_repo.dto.CalcDTO;
import com.docker.test.docker_test_repo.entity.Calc;
import com.docker.test.docker_test_repo.repository.CalcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalcService {

    private final CalcRepository calcRepository;

    public Integer add(CalcDTO calc){

        Calc newCalc = new Calc();
        newCalc.setNum1(calc.getNum1());
        newCalc.setNum2(calc.getNum2());
        newCalc.setSum(calc.getNum1() + calc.getNum2());

        calcRepository.save(newCalc);

        return calc.getNum1() + calc.getNum2();
    }

    public int minus(CalcDTO calc) {
        Calc newCalc = new Calc();
        newCalc.setNum1(calc.getNum1());
        newCalc.setNum2(calc.getNum2());
        newCalc.setSum(calc.getNum1() - calc.getNum2());

        calcRepository.save(newCalc);

        return calc.getNum1() - calc.getNum2();
    }
}
