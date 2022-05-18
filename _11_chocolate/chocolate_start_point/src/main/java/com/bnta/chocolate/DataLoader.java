package com.bnta.chocolate;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate e1 = new Estate("McVities", "United Kingdom");
        Estate e2 = new Estate("ChocolateYumYum", "Canada");
        Estate e3 = new Estate("GoldCocoa", "Ghana");
        Estate e4 = new Estate("Dark and Lovely", "United States");
        Estate e5 = new Estate("Chocolat", "Togo");

        Chocolate c1 = new Chocolate("Twirlicious", 15, e1);
        Chocolate c2 = new Chocolate("White button", 0, e1);
        Chocolate c3 = new Chocolate("Dit Dog", 11, e1);
        Chocolate c4 = new Chocolate("Dixy", 23, e1);
        Chocolate c5 = new Chocolate("Breakaway", 15, e2);
        Chocolate c6 = new Chocolate("Scrumdiddly", 15, e2);
        Chocolate c7 = new Chocolate("Love", 30, e2);
        Chocolate c8 = new Chocolate("Trust", 25, e2);
        Chocolate c9 = new Chocolate("Smile", 50, e3);
        Chocolate c10 = new Chocolate("Deep", 80, e3);
        Chocolate c11 = new Chocolate("Melt", 75, e3);
        Chocolate c12 = new Chocolate("Funsies", 33, e3);
        Chocolate c13 = new Chocolate("Bountiful", 47, e4);
        Chocolate c14 = new Chocolate("Chat", 15, e5);
        Chocolate c15 = new Chocolate("Ecole", 25, e5);
        Chocolate c16 = new Chocolate("Bisou", 35, e5);

        e1.setChocolates(List.of(c1, c2, c3 , c4));
        e2.setChocolates(List.of(c5, c6, c7, c8));
        e3.setChocolates(List.of(c9, c10, c11, c12));
        e4.setChocolates(List.of(c13));
        e5.setChocolates(List.of(c14, c15, c16));

        estateRepository.saveAll(List.of(e1, e2, e3, e4, e5));


    }

}
