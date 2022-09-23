package com.example.onlineOrder.controller;

import com.example.onlineOrder.entity.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.onlineOrder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    @ResponseBody
    public Cart getCart(){

        return cartService.getCart();

    }
}
