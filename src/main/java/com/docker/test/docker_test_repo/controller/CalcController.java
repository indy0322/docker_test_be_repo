package com.docker.test.docker_test_repo.controller;


import com.docker.test.docker_test_repo.dto.CalcDTO;
import com.docker.test.docker_test_repo.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
@RequiredArgsConstructor
public class CalcController {

    private final CalcService calcService;

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("I'm Alive");
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> add(@RequestBody CalcDTO calc){
        int result = calcService.add(calc);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/sub")
    public ResponseEntity<Integer> minus(@RequestBody CalcDTO calc){
        int result = calcService.minus(calc);
        return ResponseEntity.ok(result);
    }
}
