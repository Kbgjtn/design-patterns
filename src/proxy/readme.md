# Proxy

### Definition

- `Proxy Object` adalah sebuah structural design pattern yang menyediakan sebuah object yang bertindak substitute (pengganti):
  pada conteks ini, "Object" yang yang dirujuk sebagai Proxy Object. Selain itu dapat juga bertindak sebagai pengganti
  atau placeholder untuk object lain, dimana sering disebut sebagai `Service Object`.
- `Real Service Object` merupakan yang dapat melakukan/menyediakan beberapa fungsi atau layanan.
- `Client` adalah kode atau komponen yang membuat permintaan atau berinteraksi dengan Real Service Object.

Proxy Menerima Permintaan Klien:

- `Proxy Object` akan intercepts atau menerima requests dari `Client`.
- Alih-alih `Client` secara langsung berinteraksi dengan objek layanan yang sebenarnya, klien berkomunikasi dengan proxy.

Dikarenakan proxy dapat intercepts request dari `Client`,
maka disini biasanya proxy dapat melakukan beberapa
pekerjaan tambahan, seperti:

- Access Controll
- Caching
- Logging

Setelah selesai, `Proxy Object` akan meneruskan (passes) request tersebut ke `Service Object`
untuk menjalankan fungsionalitas atau layanan aktual yang diminta oleh client
