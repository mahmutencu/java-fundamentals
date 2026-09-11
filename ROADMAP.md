# 4 Haftalık Java & Git Geliştirici Yol Haritası

## 1. HAFTA: Git Temeli, Java Sözdizimi ve Mantıksal Kontroller

| Gün | 08:00 - 10:00 (Java Odak) | 12:30 - 13:30 (Git & Teknik İngilizce) | Durum |
| :--- | :--- | :--- | :---: |
| **1. Gün** | JDK ve IntelliJ IDEA kurulumu, CMD üzerinden `javac` ve `java` ile ilk programı derleme. Değişkenler ve primitive tipler. | Git Bash kurulumu, global config tanımlama (`user.name`, `user.email`), `first-step` reposu oluşturup ilk commit'i atma. | [x] |
| **2. Gün** | Scanner ile konsol girdileri alma. Mini Projeler: *Beden Kitle İndeksi* ve *Hipotenüs Bulma*. Hatalı tipler girerek exception davranışını izleme. | Git durum kontrolü (`git status`), Staging Area mantığı (`git add`), anlamlı commit mesajı yazma standardı (`feat: ...`). 20 dk Java docs okuma. | [ ] |
| **3. Gün** | Koşullu durumlar (`if-else`, `switch-case`). Mini Projeler: *Maksimum Sayıyı Bulma* ve *Basit Hesap Makinesi*. | Çözülen mini projeleri tek bir `java-basics` yerel reposuna aktarma, commit geçmişini `git log --oneline` ile inceleme. 20 dk İngilizce teknik terim çıkarma. | [ ] |
| **4. Gün** | Döngüler: `for`, `while`, `do-while`, `break` ve `continue`. Mini Projeler: *Döngülerle ATM Programı* ve *Armstrong Sayısı*. | GitHub'da remote repo açma (`java-basics`), `git remote add origin` ve ilk `git push -u origin main` işlemi. README dosyası yazma. | [ ] |
| **5. Gün** | Metotlar, parametre aktarımı, `return` mekanizması ve bellek scope mantığı (Stack-Heap ayrımına giriş). | `git branch` ve `git checkout -b` mantığı. Projeye dal (branch) açıp yeni bir özellik ekleyip `main` dalına merge etme. 25 dk dokümantasyon okuma. | [ ] |
| **6. Gün** | Method Overloading kavramı. Mini Proje: *Method Overloading ile Gelişmiş Hesap Makinesi*. Asal sayı ve Ebob bulma algoritmaları. | Çakışma (merge conflict) simülasyonu: İki farklı dalda aynı satırı değiştirip Git'in nasıl davrandığını görme ve terminalde çözme. | [ ] |
| **7. Gün** | **Haftalık Tekrar:** 1. haftanın tüm kodlarını sıfırdan, videoya bakmadan tek bir konsol menüsünde birleştirme. | Tüm haftalık kodları temiz bir branch ile GitHub'a pushlama. 45 dk B1 seviyesine uygun Java OOP giriş makalesi okuma ve 3 cümlelik özet çıkarma. | [ ] |

---

## 2. HAFTA: Nesne Yönelimli Programlama (OOP) ve Bellek Mimarisi

| Gün | 08:00 - 10:00 (Java OOP Odak) | 12:30 - 13:30 (Git & Teknik İngilizce) | Durum |
| :--- | :--- | :--- | :---: |
| **8. Gün** | OOP Giriş, Sınıf (Class) ve Nesne (Object) mantığı. `Constructor` (Yapıcı Metotlar), `this` anahtar kelimesi. | GitHub profil README reposu (`username/username`) oluşturma, Markdown sözdizimi ile sade bir hakkımda taslağı yazma. | [ ] |
| **9. Gün** | Obje Referansları (Referans tipler bellekte nasıl tutulur, `null` mantığı). Mini Proje: *Nesne Yönelimli ATM* kodlaması. | Kodları modüler commit'lere bölme (`git commit -m "feat: add Account and ATM classes"`). 25 dk Java Memory (Stack vs Heap) dokümantasyonu okuma. | [ ] |
| **10. Gün** | Kalıtım (Inheritance) temelleri, `extends`, `super` anahtar kelimesi ve Metot Ezme (`@Override`). | Projeye `.gitignore` dosyası ekleme (`.idea/`, `out/`, `*.class` dosyalarını yok saydırma pratiği). | [ ] |
| **11. Gün** | Mini Proje: *Çalışanlar Projesi* (Yönetici, Programcı alt sınıfları ve ortak metot ezme senaryoları). | GitHub profil README'sine dil ve araç rozetleri (badges) ekleme, profil görünümünü düzenleme. 20 dk teknik okuma. | [ ] |
| **12. Gün** | Kompozisyon (Composition - "has-a" ilişkisi). Mini Proje: *Bilgisayar Parçaları ile Kasa Toplama Sınıfı*. | GitHub'da Issues ve Pull Request açma pratiği. Kendi kendine kod inceleme (code review) adımları. | [ ] |
| **13. Gün** | Kapsülleme (Encapsulation), `getter/setter` kontrol mekanizmaları, `private` vs `public` sınırları. | Yazılan OOP projelerinin commit geçmişini temiz tutma. 30 dk "Polymorphism explained" temalı İngilizce teknik video izleme. | [ ] |
| **14. Gün** | Çok Biçimlilik (Polymorphism) mantığı, `instanceof` kontrolü, `Object` sınıfı. Mini Proje: *Beyblade Programı*. | Hafta boyunca yazılan OOP kodlarını `java-oop-core` adıyla tek bir GitHub reposunda derleyip mimarisini anlatan detaylı bir README yazma. | [ ] |

---

## 3. HAFTA: İleri Mimari, Veri Yapıları ve Collection Framework

| Gün | 08:00 - 10:00 (Java İleri Düzey Odak) | 12:30 - 13:30 (Git & Teknik İngilizce) | Durum |
| :--- | :--- | :--- | :---: |
| **15. Gün** | Arayüzler (Interface), implementasyon kuralları ve çoklu arayüz kullanımı. Soyutlama (Abstraction) mimarisi. | Git stash komutunun mantığını öğrenme (yarım kalan işi kenara alma ve geri getirme). 20 dk Interface dokümantasyonu okuma. | [ ] |
| **16. Gün** | Soyut (Abstract) Sınıflar, Interface ile farkları. Mini Proje: *Geometrik Şekillerin Alanlarını Hesaplama*. | Projede Interface referansı üzerinden kod yazımı ve GitHub commit'i (`refactor: decouple shape calculations with Shape interface`). | [ ] |
| **17. Gün** | `static`, `final` anahtar kelimeleri ve Paket (Package) mimarisi. Generic Sınıf ve Generic Metot oluşturma. | GitHub Releases ve Tag mantığı (`git tag -a v1.0 -m "release: core oop finished"`). 25 dk Generic Types üzerine İngilizce kaynak okuma. | [ ] |
| **18. Gün** | Java Collection Framework Giriş: `List` arayüzü, `ArrayList` ve `LinkedList` performans farkları ($O(1)$ vs $O(n)$). | Koleksiyon performanslarını kıyaslayan kod parçalarını commit etme. LeetCode hesabı açıp arayüzünü inceleme. | [ ] |
| **19. Gün** | `Set` arayüzü (`HashSet`, `TreeSet`) ve `Map` arayüzü (`HashMap`, `TreeMap`). `hashCode()` ve `equals()` önemi. | Mini Proje: *Map Kullanarak Harf Frekansı Bulma*. Terminalden pushlama ve 20 dk Big-O karmaşıklığı üzerine İngilizce video izleme. | [ ] |
| **20. Gün** | `Queue`, `PriorityQueue` ve `Stack` yapıları. Mini Projeler: *Stack ile Palindrome Kontrolü* ve *PriorityQueue ile Acil Servis*. | Acil Servis algoritmasını açıklayan bir README bölümü yazma. Markdown tablolarıyla algoritma adımlarını belgeleme. | [ ] |
| **21. Gün** | Hata Yakalama (Exception Handling): `try-catch-finally`, `throw`/`throws` ve *Özel Exception Sınıfı Yazma*. | Kod bloklarındaki hata yakalama mekanizmalarını test etme, commit etme. Haftalık değerlendirme ve eksik tamamlama. | [ ] |

---

## 4. HAFTA: Dosya Yönetimi, Veritabanı (JDBC) ve Konsol Portföy Projesi

| Gün | 08:00 - 10:00 (Veritabanı & Proje Odak) | 12:30 - 13:30 (Git & Portföy Odak) | Durum |
| :--- | :--- | :--- | :---: |
| **22. Gün** | Java I/O: `FileReader`, `BufferedReader`, `FileWriter` ve `Try-with-resources` kullanımı. Dosyadan not hesaplama. | Dosya okuma ve yazma işlemlerinde oluşan exception'ları yönetip GitHub'a yükleme. 20 dk JDBC mimarisi üzerine İngilizce makale okuma. | [ ] |
| **23. Gün** | MySQL ve XAMPP kurulumu. MySQL Workbench/Terminal ile temel SQL: `CREATE TABLE`, `INSERT`, `SELECT`, `UPDATE`, `DELETE`. | Veritabanı tablolarının SQL dump (`.sql`) dosyasını çıkarma ve repoya ekleme pratiği. | [ ] |
| **24. Gün** | JDBC Girişi: `DriverManager`, `Connection`, `Statement` ve `ResultSet` ile Java'yı MySQL'e bağlama. | Git log optimizasyonu ve rebase kavramını temel seviyede anlama. 20 dk SQL Injection önleme üzerine İngilizce okuma. | [ ] |
| **25. Gün** | `PreparedStatement` kullanımı (SQL Injection engelleme), Transaction mantığı (`commit` ve `rollback` operasyonları). | `PreparedStatement` ile güvenli veri ekleme ve silme fonksiyonlarını test edip branch üzerinden pushlama. | [ ] |
| **26. Gün** | **Büyük Proje Başlangıcı (Şirket Çalışanları CLI):** Veritabanı şemasını kurma, `Calisan` sınıfını tasarlama, CRUD backend metotları. | Proje için GitHub'da yeni bir repository açma (`employee-management-system-cli`), `.gitignore` ve ilk mimari şablonunu oluşturma. | [ ] |
| **27. Gün** | **Büyük Proje Bitişi:** Konsol menü döngüsü (ekleme, silme, güncelleme, arama), Exception'ları yakalama, veritabanı loglama. | Projenin uçtan uca test edilmesi, hataların ayıklanması, kod bloklarının temizlenmesi (Refactoring). | [ ] |
| **28. Gün** | **Portföy Teslimi:** Projeyi çalıştırılabilir `.jar` dosyası haline getirme. Kodun son review seansı. | Mühendislik standardında kapsamlı `README.md` yazımı (Kurulum adımları, sistem mimarisi şeması, kullanılan teknolojiler, çözülen problemler). | [ ] |