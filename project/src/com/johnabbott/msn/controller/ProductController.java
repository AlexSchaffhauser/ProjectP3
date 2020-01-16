package com.johnabbott.msn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.msn.model.Product;
import com.johnabbott.msn.service.ProductService;

@Transactional
@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getProductList() {
		ModelAndView modelView = new ModelAndView("home");

		List<Product> students = service.getProducts();
		List<Product> shipping = service.getShippedProducts();
		modelView.addObject("prodList", students);
		modelView.addObject("shipList", shipping);
		modelView.addObject("product", new Product());

		return modelView;
	}

	@RequestMapping(value = "/addproduct")
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView("add-product");
		mv.addObject("product", new Product());
		return mv;
	}
	
	@RequestMapping(value = "saveProduct", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product prd) {
		if (service.addProduct(prd))
			return "redirect:/home";
		else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "shipproduct")
	public ModelAndView shipProduct(@RequestParam("productId") int productId) {
		ModelAndView mv = new ModelAndView("add-shipping");
		Product fetchedProduct = service.getProductById(productId);
		mv.addObject("shippedproduct", fetchedProduct);
		return mv;
	}

	@RequestMapping(value = "updateShipping")
	public String updateShipping(@ModelAttribute("product") Product prd) {
		if (service.updateProduct(prd)) {
			return "redirect:/home";
		} else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "deleteproduct")
	public String deleteProduct(@RequestParam("productId") int productId) {
		if (service.deleteProduct(productId)) {
			return "redirect:/home";
		}
		else {
			return "ErrorPage";
		}
	}
	
}
