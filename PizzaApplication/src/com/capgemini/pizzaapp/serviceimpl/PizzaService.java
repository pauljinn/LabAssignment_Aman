package com.capgemini.pizzaapp.serviceimpl;

import java.util.List;

import com.capgemini.pizzaapp.model.Pizza;
import com.capgemini.pizzaapp.service.IPizzaService;
import com.capgemini.pizzaapp.daoimpl.Dao;

public class PizzaService implements IPizzaService {
	
	private Dao pizzaDao;
	public PizzaService() {
		pizzaDao = new Dao();
	}

	@Override
	public void orderPizza(Pizza pizza) {
		pizza.setId(System.currentTimeMillis());
		pizzaDao.savePizza(pizza);
		
	}

	@Override
	public List<Pizza> getAllPizza() {
		return pizzaDao.list();
	}

	@Override
	public void customizePizza(Pizza pizza) {
		pizzaDao.update(pizza);
		
	}

	@Override
	public boolean cancelOrder(Pizza pizza) {
		return pizzaDao.delete(pizza);
	}

	@Override
	public boolean cancelOrder(long pizzaId) {
		return pizzaDao.delete(pizzaId);
	}

}
