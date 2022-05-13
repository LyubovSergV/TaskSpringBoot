package service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RUBRateProvider {

    public int rubRate;

    @Scheduled(fixedDelay = 100)
    public void parse(){
        System.out.println("Курс доллара");
        rubRate=80;
    }
}
