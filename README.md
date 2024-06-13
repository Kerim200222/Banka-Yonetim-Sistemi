# Banka Yönetim Sistemi

## Genel Gereksinimler
- **Arayüz:** Kullanıcı dostu bir grafik kullanıcı arayüzü (GUI) kullanarak gerçekleştirilmelidir.
- **Veritabanı Entegrasyonu:** Proje bilgilerini yönetmek için MySQL veya SQLite gibi bir veritabanı kullanılmalı. Veritabanı kullanmak istemeyen arkadaşlar Excel üzerinden de işlemleri yapabilirler.
- **Nesne Yönelimli Programlama (OOP):** Uygulama, OOP prensipleri kullanılarak geliştirilmelidir.

## Özellikler Listesi

### 1. Kullanıcı Girişi ve Yönetimi
- Kullanıcı girişi ve yeni kullanıcı kaydı (müşteriler ve banka çalışanları).
- Kullanıcı yetkilendirme seviyeleri ve rol bazlı erişim kontrolü.

### 2. Müşteri Yönetimi
- Müşteri bilgilerinin ekleme, güncelleme, silme işlemleri.
- Müşteri bilgileri (ad, soyad, adres, telefon numarası, e-posta).

### 3. Hesap İşlemleri
- Yeni banka hesapları açma, mevcut hesapları güncelleme ve kapatma.
- Hesap türleri (tasarruf, vadesiz, yatırım hesapları) yönetimi.
- Hesap hareketlerini görüntüleme (para yatırma, çekme, transfer).

### 4. Kredi ve Borç Yönetimi
- Kredi başvuruları, onayları ve kredi ödeme planları.
- Müşteri borç ve kredi takibi.

### 5. Para Transferi İşlemleri
- Hesaplar arası transfer.
- Uluslararası para transferi işlemleri.

### 6. ATM Yönetimi
- ATM cihazlarının durumunu ve işlemlerini izleme.
- ATM para yüklemeleri ve boşaltmaları.

### 7. Raporlama ve İstatistikler
- Hesap hareketleri, kredi kullanım raporları ve günlük işlem özetleri.
- Müşteri risk analizleri ve mali sağlık raporları.

## Kurulum
Bu projeyi kurmak için aşağıdaki adımları takip edin:
1. Depoyu yerel makinenize klonlayın:
   ```bash
   git clone https://github.com/username/repository.git
