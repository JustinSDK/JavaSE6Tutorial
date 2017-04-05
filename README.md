Java SE 6 技術手冊
==================

為什麼選擇用 Markdown？只是單純把文件重新排版太無聊了，不如趁這個機會學些新東西，所以我就藉這個機會來學著用 Markdown，並看看它有什麼好處與壞處 ... 如果你需要 PDF 與 epub 格式，而又有點懶自己轉換，那麼可以考慮在 [Google Play](https://play.google.com/store/books/details?id=IYqPAgAAQBAJ) 或 [Pubu](http://www.pubu.com.tw/ebook/Java-SE-6-%E6%8A%80%E8%A1%93%E6%89%8B%E5%86%8A-28587)  上向便當價致敬，如果你需要 mobi 格式，可以使用 [calibre](http://calibre-ebook.com/)  把 epub 轉為 mobi ... :)

我在 GitBook 上用這本書前半本 [試排了一個版本](http://caterpillar.gitbooks.io/javase6tutorial/)，如果你需要在 GitBook 上取得完整版本，請跟我聯絡！

《Java SE 6 技術手冊》（以及它先前的版本）是以 [我的網站](https://openhome.cc) 中早期學習 Java 的筆記 [JavaGossip1](https://openhome.cc/Gossip/JavaGossip-V1/) 與 [JavaGossip2](https://openhome.cc/Gossip/JavaGossip-V2/) 為基礎，記錄著我學習 Java 的一些心得。

在 JDK7 問世之後，由於累積不少 Java 教學經驗與想法，為了有一本可以符合我教學所需的教材，因而在為 JDK7 撰寫 Java 書籍時，並不是改版《Java SE 6 技術手冊》，而是重新撰寫了一本 [《Java SE 7 技術手冊》](http://books.gotop.com.tw/bookdetails.aspx?bn=ACL034000)。

《Java SE 6 技術手冊》呢？就我目前來看它，真的就像是筆記，然而就因為是筆記，想法、口吻、脈絡甚至範例上，都比較適合新手，在靜靜地留在我硬碟近兩年，我有一天看到它，想說放著也是沒用，不如開放它 ... 

在將《Java SE 6 技術手冊》重新使用 Markdown 排版的過程中，我盡量保留內容原貌，努力忍住不去修改內容，目的很簡單，如果你覺得有任何覺得過時或不妥的地方，就去修改它 ...

每章的〈網路資源〉被我拿掉了，因為不少鏈結年代久遠已經失效，我懶得一個一個去檢查還有哪些鏈結活著 ... 附錄內容也因較舊而拿掉了，你可以分別參考以下資訊：

- [認識 Gradle](http://www.codedata.com.tw/java/understanding-gradle-1-ant/)
- [JUnit](https://openhome.cc/Gossip/JUnit/)
- [MySQL 超新手入門](http://www.codedata.com.tw/database/mysql-tutorial-getting-started/)

原始碼範例都改為 UTF-8 編碼了，因此使用 `javac` 編譯時，記得加上 `-encoding UTF-8`。

新的 Java 文件基於 JDK8 而撰寫，你可以在 [我的網站](https://openhome.cc) 上的 [Java Gossip](https://openhome.cc/Gossip/Java/) 進行閱讀。

----------

- [第 1 章 瞭解 Java](docs/CH01.md#%E7%AC%AC-1-%E7%AB%A0-%E7%9E%AD%E8%A7%A3-java)
  - [1.1　什麼是 Java](docs/CH01.md#11%E4%BB%80%E9%BA%BC%E6%98%AF-java)
  - [1.2　Java 的特性](docs/CH01.md#12java-%E7%9A%84%E7%89%B9%E6%80%A7)
  - [1.3　如何學習 Java](docs/CH01.md#13%E5%A6%82%E4%BD%95%E5%AD%B8%E7%BF%92-java)
  - [1.4　接下來的主題](docs/CH01.md#14%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)

- [第 2 章 入門準備](docs/CH02.md#%E7%AC%AC-2-%E7%AB%A0-%E5%85%A5%E9%96%80%E6%BA%96%E5%82%99)
  - [2.1 下載、安裝、瞭解 JDK](docs/CH02.md#21-%E4%B8%8B%E8%BC%89%E5%AE%89%E8%A3%9D%E7%9E%AD%E8%A7%A3-jdk)
  - [2.2 設定 Path 與 Classpath](docs/CH02.md#22-%E8%A8%AD%E5%AE%9A-path-%E8%88%87-classpath)
  - [2.3 第一個 Java 程式](docs/CH02.md#23-%E7%AC%AC%E4%B8%80%E5%80%8B-java-%E7%A8%8B%E5%BC%8F)
  - [2.4 選擇開發工具](docs/CH02.md#24-%E9%81%B8%E6%93%87%E9%96%8B%E7%99%BC%E5%B7%A5%E5%85%B7)
  - [2.5 接下來的主題](docs/CH02.md#25-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 3 章 語法入門](docs/CH03.md#%E7%AC%AC-3-%E7%AB%A0-%E8%AA%9E%E6%B3%95%E5%85%A5%E9%96%80)
  - [3.1 第一個 Java 程式](docs/CH03.md#31-%E7%AC%AC%E4%B8%80%E5%80%8B-java-%E7%A8%8B%E5%BC%8F)
  - [3.2 在文字模式下與程式互動](docs/CH03.md#32-%E5%9C%A8%E6%96%87%E5%AD%97%E6%A8%A1%E5%BC%8F%E4%B8%8B%E8%88%87%E7%A8%8B%E5%BC%8F%E4%BA%92%E5%8B%95)
  - [3.3 資料、運算](docs/CH03.md#33-%E8%B3%87%E6%96%99%E9%81%8B%E7%AE%97)
  - [3.4 流程控制](docs/CH03.md#34-%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6)
  - [3.5 接下來的主題](docs/CH03.md#35-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 4 章 從 autoboxing、unboxing 認識物件](docs/CH04.md#%E7%AC%AC-4-%E7%AB%A0-%E5%BE%9E-autoboxingunboxing-%E8%AA%8D%E8%AD%98%E7%89%A9%E4%BB%B6)
  - [4.1 關於物件](docs/CH04.md#41-%E9%97%9C%E6%96%BC%E7%89%A9%E4%BB%B6)
  - [4.2 自動裝箱、拆箱](docs/CH04.md#42-%E8%87%AA%E5%8B%95%E8%A3%9D%E7%AE%B1%E6%8B%86%E7%AE%B1)
  - [4.3 接下來的主題](docs/CH04.md#43-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 5 章 陣列](docs/CH05.md#%E7%AC%AC-5-%E7%AB%A0-%E9%99%A3%E5%88%97)
  - [5.1 一維陣列、二維陣列](docs/CH05.md#51-%E4%B8%80%E7%B6%AD%E9%99%A3%E5%88%97%E4%BA%8C%E7%B6%AD%E9%99%A3%E5%88%97)
  - [5.2 進階陣列觀念](docs/CH05.md#52-%E9%80%B2%E9%9A%8E%E9%99%A3%E5%88%97%E8%A7%80%E5%BF%B5)
  - [5.3 接下來的主題](docs/CH05.md#53-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 6 章 字串](docs/CH06.md#%E7%AC%AC-6-%E7%AB%A0-%E5%AD%97%E4%B8%B2)
  - [6.1 認識字串](docs/CH06.md#61-%E8%AA%8D%E8%AD%98%E5%AD%97%E4%B8%B2)
  - [6.2 字串進階運用](docs/CH06.md#62-%E5%AD%97%E4%B8%B2%E9%80%B2%E9%9A%8E%E9%81%8B%E7%94%A8)
  - [6.3 接下來的主題](docs/CH06.md#63-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 7 章 封裝（Encapsulation）](docs/CH07.md#%E7%AC%AC-7-%E7%AB%A0-%E5%B0%81%E8%A3%9Dencapsulation)
  - [7.1 定義類別（Class）](docs/CH07.md#71-%E5%AE%9A%E7%BE%A9%E9%A1%9E%E5%88%A5class)
  - [7.2 關於方法](docs/CH07.md#72-%E9%97%9C%E6%96%BC%E6%96%B9%E6%B3%95)
  - [7.3 接下來的主題](docs/CH07.md#73-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 8 章 繼承（Inheritance）、多型（Polymorphism）](docs/CH08.md#%E7%AC%AC-8-%E7%AB%A0-%E7%B9%BC%E6%89%BFinheritance%E5%A4%9A%E5%9E%8Bpolymorphism)
  - [8.1 繼承](docs/CH08.md#81-%E7%B9%BC%E6%89%BF)
  - [8.2 多型（Polymorphism）](docs/CH08.md#82-%E5%A4%9A%E5%9E%8Bpolymorphism)
  - [8.3 接下來的主題](docs/CH08.md#83-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 9 章 管理類別檔案](docs/CH09.md#%E7%AC%AC-9-%E7%AB%A0-%E7%AE%A1%E7%90%86%E9%A1%9E%E5%88%A5%E6%AA%94%E6%A1%88)
  - [9.1 內部類別](docs/CH09.md#91-%E5%85%A7%E9%83%A8%E9%A1%9E%E5%88%A5)
  - [9.2 package 與 import](docs/CH09.md#92-package-%E8%88%87-import)
  - [9.3 接下來的主題](docs/CH09.md#93-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 10 章 例外處理（Exception Handling）](docs/CH10.md#%E7%AC%AC-10-%E7%AB%A0-%E4%BE%8B%E5%A4%96%E8%99%95%E7%90%86exception-handling)
  - [10.1 例外處理入門](docs/CH10.md#101-%E4%BE%8B%E5%A4%96%E8%99%95%E7%90%86%E5%85%A5%E9%96%80)
  - [10.2 受檢例外（Checked Exception）、執行時期例外
（Runtime Exception）](docs/CH10.md#102-%E5%8F%97%E6%AA%A2%E4%BE%8B%E5%A4%96checked-exception%E5%9F%B7%E8%A1%8C%E6%99%82%E6%9C%9F%E4%BE%8B%E5%A4%96runtime-exception)
  - [10.3 throw、throws](docs/CH10.md#103-throwthrows)
  - [10.4 例外的繼承架構](docs/CH10.md#104-%E4%BE%8B%E5%A4%96%E7%9A%84%E7%B9%BC%E6%89%BF%E6%9E%B6%E6%A7%8B)
  - [10.5 斷言（Assertion）](docs/CH10.md#105-%E6%96%B7%E8%A8%80assertion)
  - [10.6 接下來的主題](docs/CH10.md#106-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 11 章 列舉型態（Enumerated Types）](docs/CH11.md#%E7%AC%AC-11-%E7%AB%A0-%E5%88%97%E8%88%89%E5%9E%8B%E6%85%8Benumerated-types)
  - [11.1 常數設置與列舉型態](docs/CH11.md#111-%E5%B8%B8%E6%95%B8%E8%A8%AD%E7%BD%AE%E8%88%87%E5%88%97%E8%88%89%E5%9E%8B%E6%85%8B)
  - [11.2 定義列舉型態](docs/CH11.md#112-%E5%AE%9A%E7%BE%A9%E5%88%97%E8%88%89%E5%9E%8B%E6%85%8B)
  - [11.3 接下來的主題](docs/CH11.md#113-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 12 章 泛型（Generics）](docs/CH12.md#%E7%AC%AC-12-%E7%AB%A0-%E6%B3%9B%E5%9E%8B)
  - [12.1 泛型入門](docs/CH12.md#121-%E6%B3%9B%E5%9E%8B%E5%85%A5%E9%96%80)
  - [12.2 泛型進階語法](docs/CH12.md#122-%E6%B3%9B%E5%9E%8B%E9%80%B2%E9%9A%8E%E8%AA%9E%E6%B3%95)
  - [12.3 接下來的主題](docs/CH12.md#123-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 13 章 物件容器（Container）](docs/CH13.md#%E7%AC%AC-13-%E7%AB%A0-%E7%89%A9%E4%BB%B6%E5%AE%B9%E5%99%A8container)
  - [13.1 Collection 類](docs/CH13.md#131-collection-%E9%A1%9E)
  - [13.2 Map 類](docs/CH13.md#132-map-%E9%A1%9E)
  - [13.3 接下來的主題](docs/CH13.md#133-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 14 章 輸入輸出](docs/CH14.md#%E7%AC%AC-14-%E7%AB%A0-%E8%BC%B8%E5%85%A5%E8%BC%B8%E5%87%BA)
  - [14.1 檔案](docs/CH14.md#141-%E6%AA%94%E6%A1%88)
  - [14.2 位元串流](docs/CH14.md#142-%E4%BD%8D%E5%85%83%E4%B8%B2%E6%B5%81)
  - [14.3 字元串流](docs/CH14.md#143-%E5%AD%97%E5%85%83%E4%B8%B2%E6%B5%81)
  - [14.4 接下來的主題](docs/CH14.md#144-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 15 章 執行緒（Thread）](docs/CH15.md#%E7%AC%AC-15-%E7%AB%A0-%E5%9F%B7%E8%A1%8C%E7%B7%92thread)
  - [15.1 執行緒入門](docs/CH15.md#151-%E5%9F%B7%E8%A1%8C%E7%B7%92%E5%85%A5%E9%96%80)
  - [15.2 同步化（synchronized）議題](docs/CH15.md#152-%E5%90%8C%E6%AD%A5%E5%8C%96synchronized%E8%AD%B0%E9%A1%8C)
  - [15.3 concurrent 套件新增類別](docs/CH15.md#153-concurrent-%E5%A5%97%E4%BB%B6%E6%96%B0%E5%A2%9E%E9%A1%9E%E5%88%A5)
  - [15.4 接下來的主題](docs/CH15.md#154-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 16 章 反射（Reflection）](docs/CH16.md#%E7%AC%AC-16-%E7%AB%A0-%E5%8F%8D%E5%B0%84reflection)
  - [16.1 類別載入與檢視](docs/CH16.md#161-%E9%A1%9E%E5%88%A5%E8%BC%89%E5%85%A5%E8%88%87%E6%AA%A2%E8%A6%96)
  - [16.2 使用反射生成與操作物件](docs/CH16.md#162-%E4%BD%BF%E7%94%A8%E5%8F%8D%E5%B0%84%E7%94%9F%E6%88%90%E8%88%87%E6%93%8D%E4%BD%9C%E7%89%A9%E4%BB%B6)
  - [16.3 接下來的主題](docs/CH16.md#163-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 17 章 Annotation](docs/CH17.md#%E7%AC%AC-17-%E7%AB%A0-annotation)
  - [17.1 Annotation](docs/CH17.md#171-annotation)
  - [17.2 meta-annotation](docs/CH17.md#172-meta-annotation)
  - [17.3 接下來的主題](docs/CH17.md#173-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 18 章 捨遺補缺](docs/CH18.md#%E7%AC%AC-18-%E7%AB%A0-%E6%8D%A8%E9%81%BA%E8%A3%9C%E7%BC%BA)
  - [18.1 日期、時間](docs/CH18.md#181-%E6%97%A5%E6%9C%9F%E6%99%82%E9%96%93)
  - [18.2 日誌（Logging）](docs/CH18.md#182-%E6%97%A5%E8%AA%8Clogging)
  - [18.3 訊息綁定](docs/CH18.md#183-%E8%A8%8A%E6%81%AF%E7%B6%81%E5%AE%9A)
  - [18.4 接下來的主題](docs/CH18.md#184-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)

- [第 19 章 專題製作  - 文字編輯器](docs/CH19.md#%E7%AC%AC-19-%E7%AB%A0-%E5%B0%88%E9%A1%8C%E8%A3%BD%E4%BD%9C---%E6%96%87%E5%AD%97%E7%B7%A8%E8%BC%AF%E5%99%A8)
  - [19.1 產品生命週期](docs/CH19.md#191-%E7%94%A2%E5%93%81%E7%94%9F%E5%91%BD%E9%80%B1%E6%9C%9F)
  - [19.2 Swing 入門](docs/CH19.md#192-swing-%E5%85%A5%E9%96%80)
  - [19.3 事件處理](docs/CH19.md#193-%E4%BA%8B%E4%BB%B6%E8%99%95%E7%90%86)
  - [19.4 文字編輯與儲存](docs/CH19.md#194-%E6%96%87%E5%AD%97%E7%B7%A8%E8%BC%AF%E8%88%87%E5%84%B2%E5%AD%98)
  - [19.5 Executable Jar 的製作](docs/CH19.md#195-executable-jar-%E7%9A%84%E8%A3%BD%E4%BD%9C)
  - [19.6 接下來的主題](docs/CH19.md#196-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 20 章 JDBC 入門](docs/CH20.md#%E7%AC%AC-20-%E7%AB%A0-jdbc-%E5%85%A5%E9%96%80)
  - [20.1 使用 JDBC 連接資料庫](docs/CH20.md#201-%E4%BD%BF%E7%94%A8-jdbc-%E9%80%A3%E6%8E%A5%E8%B3%87%E6%96%99%E5%BA%AB)
  - [20.2 使用 JDBC 進行資料操作](docs/CH20.md#202-%E4%BD%BF%E7%94%A8-jdbc-%E9%80%B2%E8%A1%8C%E8%B3%87%E6%96%99%E6%93%8D%E4%BD%9C)
  - [20.3 接下來的主題](docs/CH20.md#203-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
- [第 21 章 Java SE 6 新功能簡介](docs/CH21.md#java-se-6-%E6%96%B0%E5%8A%9F%E8%83%BD%E7%B0%A1%E4%BB%8B)
  - [21.1 Java SE 6 基本新功能](docs/CH21.md#211-java-se-6-%E5%9F%BA%E6%9C%AC%E6%96%B0%E5%8A%9F%E8%83%BD)
  - [21.2 Apache Derby、JDBC 4.0](docs/CH21.md#2121-%E4%BD%BF%E7%94%A8-apache-derby)
  - [21.3 接下來的主題](docs/CH21.md#213-%E6%8E%A5%E4%B8%8B%E4%BE%86%E7%9A%84%E4%B8%BB%E9%A1%8C)
 
