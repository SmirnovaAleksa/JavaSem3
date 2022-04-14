package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;

@Controller
public class SimpleController {
	@GetMapping("/simple")//localhost:8080/simple
	public String simpleFunc(){
		System.out.println("Hi!");
		return "home"; //Ielādē html lapu
	}
	//1.Izveidot kontroliera funkciju, lai varētu no backend nosūtīt uz frontend ziņu
	@GetMapping("/msg")//localhost:8080/msg
	public String msgFunc(Model model1){
		model1.addAttribute("package", "Sveiciens no backend!");
		return "msg-page";
	}
	
	//2. Izveidot html lapu kas šo ziņu saņem un attēlo
	//msg-page.html
	
	//3. Izveidot produktu klasi
	//
	
	@GetMapping("/product")//localhost:8080/product
	public String sendProductFunc(Model model) {
		Product prodTest = new Product("Abols", "Salds", 10, 0.99f);
		model.addAttribute("package", prodTest);
		return "product-page";
	}
	
}
