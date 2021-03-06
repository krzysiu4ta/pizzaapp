package pl.krzysztof.pizza.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto {

    private List<pl.krzysztof.pizza.remote.rest.dto.request.PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public AddOrderDto() {} /* pusty konstruktor jest potrzebny */

    public AddOrderDto(List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.pizzas = pizzas;
        this.person = person;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
