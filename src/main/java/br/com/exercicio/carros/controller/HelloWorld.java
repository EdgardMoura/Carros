package br.com.exercicio.carros.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicio.carros.util.Utilities;

@RestController/*Informa que a classe terá requisiçao tipo REST*/

public class HelloWorld {
	@RequestMapping(value = "/")/*Avisa que o metodo terá uma requisiçao no browse*/
	public @ResponseBody String Informacao() {/*Retorna o corpo de uma resposta REST*/
				
		return "<b>It's Works! </b> <br>" ;
	}
	@RequestMapping(value = "/soma/{a}/{b}")
	public @ResponseBody String Somando(@PathVariable int a, @PathVariable int b) {/*O metodo entende o recebimento de parametros para a variavel atraves de uma URL*/
		Utilities utilities = new Utilities();
		
		return "<b>A soma é: </b> <br>" + utilities.Sun(a , b);
	}
	@RequestMapping(value = "/subtracao/{a}/{b}")
	public @ResponseBody String Subtraindo(@PathVariable int a, @PathVariable int b) {
		Utilities utilities = new Utilities();
		
		return "<b>A subtração é: </b> <br>" + utilities.Sub(a , b);
	}
	@RequestMapping(value = "/divisao/{a}/{b}")
	public @ResponseBody String Dividindo(@PathVariable double a, @PathVariable double b) {
		Utilities utilities = new Utilities();
		
		return "<b>A divisão é: </b> <br>" + utilities.Div(a , b);
	}
	@RequestMapping(value = "/multiplicacao/{a}/{b}")
	public @ResponseBody String Multiplicando(@PathVariable int a, @PathVariable int b) {
		Utilities utilities = new Utilities();
		
		return "<b>A multiplicação é: </b> <br>" + utilities.Mul(a , b);
	}


}
