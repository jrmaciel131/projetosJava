package aplicação;

import java.util.Date;

import entidades.order;
import entidades.enums.orderStatus;

public class Program {

	public static void main(String[] args) {
		order order = new entidades.order(1080, new Date(), orderStatus.PENDENDENTE);

		System.out.println(order);
		
		orderStatus os1 = orderStatus.PENDENDENTE;
		orderStatus os2 = orderStatus.valueOf("Entrege".toUpperCase());
		
		System.out.println(os1);
		System.out.println(os2);	
}}
