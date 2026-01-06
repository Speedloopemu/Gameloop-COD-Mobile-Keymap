# Gameloop COD Mobile Keymap - Proje Analizi

Bu belge, **Gameloop-COD-Mobile-Keymap** projesinin teknik yapısını, amacını ve işleyişini detaylı bir şekilde incelemektedir.

## 1. Proje Amacı
Bu araç, Tencent'in **GameLoop** emülatörü üzerinde çalışan **Call of Duty: Mobile** (CODM) oyunu için özel tuş atamaları (keymapping) yapmayı, performans ayarlarını optimize etmeyi (FPS artırma) ve bu ayarların emülatör tarafından sıfırlanmasını engellemeyi amaçlayan bir yardımcı yazılımdır.

## 2. Teknik Özellikler
*   **Programlama Dili:** Kotlin/Native (Windows hedefli).
*   **Kullanıcı Arayüzü:** Doğrudan Windows Win32 API kullanılarak geliştirilmiştir (Hafif ve hızlı).
*   **Veritabanı:** Kare hızı ve tuş ayarlarını yönetmek için SQLite kullanır.
*   **Çok Dillilik:** Türkçe, İngilizce, Macarca ve Arapça dahil 9 farklı dil desteği sunar.

## 3. Temel Bileşenler ve İşlevleri

### A. Kontrol ve Yönetim (`Main.kt`, `Processing.kt`)
*   Uygulamanın ana döngüsünü ve Windows mesajlarını (`wndProc`) yönetir.
*   Kullanıcıyı adım adım (Dil seçimi -> Lisans -> Tuş Atama) yönlendiren bir sihirbaz arayüzüne sahiptir.
*   **Registry Erişimi:** Uygulama ayarlarını ve dil seçimini Windows Kayıt Defteri'nde (`Software\Gameloop_COD_Mobile_Keymap`) saklar.

### B. Emülatör Etkileşimi (`ConsoleManager.kt`)
*   GameLoop'un yüklü olduğu dizini otomatik olarak bulur.
*   Oyun başladığında veya ayarlar uygulanırken GameLoop süreçlerini (`GameLoopLauncher.exe`, `GameLoopEmulator.exe` vb.) sonlandırabilir veya başlatabilir.

### C. Veritabanı ve Optimizasyon (`DatabaseManager.kt`)
Projenin en kritik kısmıdır. GameLoop'un ayarlarını sakladığı `Configs.db` dosyasını modifiye eder:
*   **FPS Kilidi Kaldırma:** Varsayılan kare hızını 120'ye, maksimumu ise 300'e yükseltir.
*   **SQL Tetikleyicileri (Triggers):** Emülatörün yapılan özel ayarları üzerine yazmasını engellemek için SQLite tetikleyicileri ekler. Bu sayede ayarlar kalıcı hale gelir.

### D. Tuş Atamaları (`Default_Keymap.kt`, `keymap_*.kt`)
*   Çeşitli modlar (MP, BR, Zombi) için önceden tanımlanmış optimize tuş dizilimlerini içerir.
*   Kullanıcı arayüzünde tuşlar canlı olarak değiştirilebilir ve kaydedilebilir.

## 4. Kullanıcı Akışı
1.  **Dil Seçimi:** Kullanıcı tercih ettiği dili seçer.
2.  **Lisans Onayı:** Uygulama kullanım şartlarını gösterir.
3.  **Tuş Düzenleme:** MP (Çok oyunculu), BR (Battle Royale) ve araç kontrolleri için tuşlar kullanıcı tarafından atanır.
4.  **Uygulama:** Seçilen ayarlar veritabanına işlenir, emülatör optimize edilir ve oyun başlatılır.

## 5. Öne Çıkan Teknik Detaylar
*   **Düşük Kaynak Tüketimi:** Herhangi bir ağır framework (Electron, .NET vb.) kullanmadan doğrudan yerel Windows koduna derlenir.
*   **Gelişmiş Veritabanı Mantığı:** Sadece veri yazmakla kalmaz, emülatörün davranışını SQL seviyesinde kontrol eder.
*   **Native Interoperability:** Kotlin üzerinden `C` kütüphanelerine (Win32, SQLite) doğrudan erişim sağlanmıştır.

---
*Bu analiz kodun mevcut yapısı ve işlevleri temel alınarak hazırlanmıştır.*
