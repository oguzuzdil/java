package com.insaat;

public class Boolean_1 {

	public static void main(String[] args) {
		
		/* Boolean nesne temelli degisken turlerinden biridir.
		 
		 * Nesne tipi degiskenlerin temel avantaji; alt metodlarını
		   kullanarak islemler gerceklestirebilmeleridir. 
		   
		 * Fakat bu tur degiskenler, temel degisken turlerine gore
		   bellekte daha cok yer isgal ettikleri icin mecbur 
		   kalinmadikca kullanılmamalidir.
		   
		 * Boolean degiskeni mantik islemlerinde kullanilir.
		 
		 * Yalnizca iki olası deger vardır: true (dogru) veya false (yanlıs).
		 
		 * Varsayilan deger yanlıstır. 
		 
		 * Mantik islemlerine dogrudan true veya false degerleri
		   tanimlanabilecegi gibi diger degikenleri mantik islemleri
		   kullanarak karsilastirarak da dogru veya yanlis olup 
		   olmadigi program icinde bulunabilir.
		   
		 * Boolean degerine sayi atanirsa hata verir.
		 
		 * 1 byte yer kaplar.
		 
        /////////////////////////////////////////////////////////////////////////////////////////
         
		 * Mantiksal islemler:
		 * &&   =>   ve
		 * ||   =>   veya
		 * >    =>   buyuktur
		 * <    =>   kucuktur
		 * ==   =>   esittir
		 * >=   =>   buyuk esit
		 * <=   =>   kucuk esit
		 * !    =>   degildir
		 * !=   =>   esit degildir
		
		 */
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		//basit kiris icin donatı alanı hesabı
		
		double b = 300;       // kiris genisligi (mm)
		double h = 500;       // kiris yuksekligi (mm)
		double fck = 25;      // betonun karakterisitik basinc dayanimi (MPa)
		double fyk = 420;     // donatinin karakterisitik basinc dayanimi (MPa)
		double g = 20;        // olu yuk (kN/m)
		double q = 15;        // hareketli yuk (kN/m)
		double l = 5;         // kiris genisligi (m)
		double roMax = 0.02;  // maximum donati orani 
		
        /////////////////////////////////////////////////////////////////////////////////////////
		double P = 1.4*g + 1.6*q;                    // yukun hesaplanmasi
		double fcd = fck/1.5;                        // betonun tasarim basinc dayanimi (MPa)
		double fyd = fyk/1.15;                       // donatinin tasarim basinc dayanimi (MPa)
		double d = h-34;                             // faydali yukseklik
		double M = P*l*l/8;                          // tasarim momentinin hesaplanmasi (N.mm)
		double fctd = (0.35*Math.sqrt(fck))/1.5;     // tasarim cekme dayanimi (MPa)
		
		// Esdeger gerilme blogu derinliginin hesaplanmasi:
		double a =d-Math.sqrt(d*d-(2*M*1000000/(0.85*fcd*b)));
		
		System.out.println("a = " +a);
		
		System.out.println("h = " +h);
		
		boolean gerilmeBlogu = a<h;
		
		System.out.println("a < h  => " +gerilmeBlogu);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		double as=0.85*fcd*b*a/fyd;   
		
		double ro = as/(b*d);         //donati orani
		
		System.out.println("ro = " +ro);
		
		double roMin = 0.8*fctd/fyd;  //minimum donati orani
		
		System.out.println("ro_Min = " +roMin);
		
		boolean minDonatiOranı = ro >= roMin;
		
		System.out.println("ro >= ro_Min => " +minDonatiOranı);
		
		
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		
		double asMin = roMin*b*d;
		
		System.out.println("As = " +as);
		
		System.out.println("As_Min = " +asMin);
		
		boolean minDonati = as > asMin;
		
		System.out.println("As > As_Min => " +minDonati);
		
		
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		double asMax = roMax*b*d;
		
		System.out.println("As_Max = " +asMax);
		
        boolean maxDonatiOrani = ro <= roMax;
		
		System.out.println("ro <= ro_Max => " +maxDonatiOrani);
		
		boolean maxDonati = as < asMax;
		
		System.out.println("As < As_Max => " +maxDonati);
		
		
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		//hatali kullanım:  "Type mismatch: cannot convert from int to boolean"
		//boolean donatı_capı = 12;
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		//Boolean iliskisel operatorler ile kullanılır:
		
		System.out.println(as == asMin);
		
		System.out.println(as != asMin);
		
		System.out.println(as >= asMin);
		
		System.out.println(as <= asMin);
		
		
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		System.out.println("b = " +b);
	
		boolean  kirisGenisligi1 = true;
		boolean  kirisGenisligi2 = false;
		
		if(b>=250)
		{System.out.println("Kiris Genisligi : " +kirisGenisligi1);} 
		else
		{System.out.println("Kiris Genisligi : " +kirisGenisligi2);} 
		
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		boolean kontrol1 = !(false) && (b>=250);
		
		System.out.println("kontrol 1 = " +kontrol1);
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		boolean kontrol2 = false && (b>=250);
		
		System.out.println("kontrol 2 = " +kontrol2);
		
        /////////////////////////////////////////////////////////////////////////////////////////
       
		
		boolean kontrol3 = true || (b>=250);
		
		System.out.println("kontrol 3 = " +kontrol3);
		
        /////////////////////////////////////////////////////////////////////////////////////////
		
		boolean kontrol4 = !(true) || (b>=250);
		
		System.out.println("kontrol 4 = " +kontrol4);
		
		
				
	}

}
