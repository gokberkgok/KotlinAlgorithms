//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    // 1 ile 100 arasında 8 e bölünebilen sayılar
    var topla = 0
    for (b in 1..100){
        if (b % 8 == 0){
            topla = topla + b
        }
    }
    println(topla)

    // Faktöriyel
    var f = 5
    var factorial = 1
    for (b in 1..f){
        factorial = factorial * b

    }
    println(factorial)

    var sayi = 35
    for (a in 1..sayi){
        if (sayi % a == 0){
            println(a)
        }
    }
    // Basamak Sayısı bulma
     var sayi33 = 3
     var basamakSayisi = 1
     while (sayi33 > 10){
         sayi33 = sayi33 / 10
         basamakSayisi++
     }
     println(basamakSayisi)

     // 10 ile 1000 arasındaki tam kare sayılar
     for (a in 4..1000){
         if (a*a < 1000){
             println(a*a)
         }
     }

    // fibonacci -> 1,1,2,3,5,8,13,21,34,55
    var a = 1
    var b = 0
    var c = 1
    for (i in 1..10){
        println(c)
        a = b
        b = c
        c = a + b
    }

    // EBOB - EKOK Bulma
    var sayi1 = 30
    var sayi2 = 40  //ebob 10 ekok 120
    var ebob = 0
    var ekok = 0
    var kucukSayi = 0
    if (sayi1<sayi2){
        kucukSayi = sayi1
    }else{
        kucukSayi = sayi2
    }
    for (i in 1..kucukSayi){    // 1 den kucukSayi'ya kadar
        if (sayi1 % i == 0 && sayi2 % i == 0){
            ebob = i
        }
    }
    ekok = (sayi1 * sayi2) / ebob
    println("Sayıların EBOB Değeri : ${ebob} \nSayıların EKOK Değeri : ${ekok}")
}