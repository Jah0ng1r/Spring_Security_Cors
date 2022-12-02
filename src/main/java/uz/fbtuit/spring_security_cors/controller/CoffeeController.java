package uz.fbtuit.spring_security_cors.controller;

import org.springframework.web.bind.annotation.*;
import uz.fbtuit.spring_security_cors.model.Coffee;
import uz.fbtuit.spring_security_cors.model.Size;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
@CrossOrigin
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Americano", Size.TALL));
        coffeeList.add(new Coffee(2, "Capuchino", Size.SHORT));
        coffeeList.add(new Coffee(3, "Amazing", Size.VANTI));
        coffeeList.add(new Coffee(4, "Mexico", Size.GRANDE));
    }

    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee.id().equals(id));
    }

}
