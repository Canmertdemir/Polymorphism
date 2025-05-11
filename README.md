Java'da çok biçimlilik (polymorphism), nesnelerin farklı şekillerde davranabilmesini sağlayan, nesne yönelimli programlamanın temel taşlarından biridir. 
Bu özellik, aynı arayüzü veya üst sınıfı paylaşan farklı sınıfların, ortak bir yöntemi kendi özgün biçimlerinde uygulayabilmelerine olanak tanır.
Programlamada, bu kavram, bir nesnenin birden fazla form alabilmesini ifade eder. Java'da çok biçimlilik, özellikle kalıtım ve arayüzler aracılığıyla gerçekleştirilir.

1. Derleme Zamanı (Statik) Çok Biçimlilik – Metot Aşırı Yükleme (Overloading)
Aynı sınıf içinde, aynı isimde ancak farklı parametre listelerine sahip metotların tanımlanmasıdır. Java, metot aşırı yüklemeyi derleme zamanında çözer.

2. Çalışma Zamanı (Dinamik) Çok Biçimlilik – Metot Geçersiz Kılma (Overriding)
Bir alt sınıfın, üst sınıfından miras aldığı bir metodu kendi ihtiyacına göre yeniden tanımlamasıdır. Bu durumda, hangi metodun çağrılacağı çalışma zamanında belirlenir.
