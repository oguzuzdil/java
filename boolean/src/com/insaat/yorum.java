package com.insaat;

public class yorum {

	public static void main(String[] args) {
		
		/* Yorum satırları sadece programı okuyan kisiyi bilgilendirmek amacı taşır.
		
		 *  Bu yazılar bilgisayar tarafından kullanılamaz.
		
		 * Tek satırlı yorumlar, "//" ile başlar ve satır sonunda biter. 
		
		 * Bu komut türü tek satırlı bir kodun kısa açıklamalarında kullanıslıdır. 
		
		 * Daha uzun komutlar için, /* ile başlayıp */ 
		
		 // ile biten uzun ve çok satırlı yorumlar hazırlanabilir. 
		
		/* ile */ 
		
		// arasında yer alan herhangi bir komut derleyici tarafından göz ardı edilir. 
		
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		double D = 8;

		double donatiAlani = (Math.PI*D*D)/4;
		
		System.out.println("Donati Alani = " +donatiAlani);
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////

		double as = 1058;     //as=0.85*fcd*b*a/fyd
		
		double donatiAdedi = as/50.26;
		
		System.out.println("Donati Adedi = " +donatiAdedi);
	}

}
