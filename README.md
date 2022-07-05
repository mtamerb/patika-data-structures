

# Veri-Yapilari-ve-Algoritmalar-Proje1 
![](/assets/insert.png)
## Proje1 

[22,27,16,2,18,6] -> Insertion Sort

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

###### CEVAP1

       - İlk sayımızdan yani (22)' den başlarız. Sayımızın sağındaki ifadeyi sayımız ile karşılaştırırız.Küçük ise sayımızın ve kalan sayıların sol tarafına doğru geçiş yapar.
       - ( | işareti o anda kadar sıraladığımız sayıları gösteriyor. Bu işaretin “|” solundaki sayılar sıralanmış kabul ediyoruz. Ve her geçişte bir sağındaki sayıyı alıyoruz)

       dizimiz : [22, 27, 16, 2, 18, 6] 

       1. [22|, 27, 16, 2, 18, 6] 
       2. [22, 27|, 16, 2, 18, 6]
       3. [16, 22, 27|, 2, 18, 6] 
       4. [2, 16, 22, 27|, 18, 6] 
       5. [2, 16, 18, 22, 27|, 6] 
       6. [2, 6, 16, 18, 22, 27] 
###

2. Big-O gösterimini yazınız.
###### CEVAP2
      Best case    : O(n)
      Average case : O(n^2)
      Worst case   : O(n^2)
###   

###
3. Time Complexity:
###### CEVAP3
      Sokma sıralamasının (insert sort) performansı O(n2)’dir. Bunun sebebi dizideki eleman sayısı kadar geçiş gerekmesi ve her geçişte en kötü ihtimalle elemsan sayısı kadar kaydırma gerekmesidir. Yani insertion sort’un en kötü durumu tersten sıralı bir listedir. Yukarıdaki örneği düşünecek olursak:
     - Worst case: [27, 22, 18, 16, 6, 2]  
     - Best case: [2, 6, 16, 18, 22, 27]
###
4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

###### CEVAP4
      Average case

###


   - [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

 ###### CEVAP5

      1. [7| , 3, 5, 8, 2, 9, 4, 15, 6]
      2. [3, 7| , 5, 8, 2, 9, 4, 15, 6]
      3. [3, 5, 7| , 8, 2, 9, 4, 15, 6]
      4. [3, 5, 7, 8| , 2, 9, 4, 15, 6]
 ###
 
 
 ![](/assets/insert.png)
## Proje2
 
 
 
 
 
 
 
 
 
 
 More info : https://bilgisayarkavramlari.com/2008/12/12/sokma-siralamasi-ekleme-siralamasi-insertion-sorting/
