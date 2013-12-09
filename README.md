Java SE 6 技術手冊
==================

《Java SE 6 技術手冊》（以及它先前的版本）是以 [我的網站](http://openhome.cc) 中早期學習 Java 的筆記 [JavaGossip1](http://openhome.cc/Gossip/JavaGossip-V1/) 與 [JavaGossip2](http://openhome.cc/Gossip/JavaGossip-V2/) 為基礎，記錄著我學習 Java 的一些心得。

在 JDK7 問世之後，由於累積不少 Java 教學經驗與想法，為了有一本可以符合我教學所需的教材，因而在為 JDK7 撰寫 Java 書籍時，並不是改版《Java SE 6 技術手冊》，而是重新撰寫了一本 [《Java SE 7 技術手冊》](http://books.gotop.com.tw/bookdetails.aspx?bn=ACL034000)。

《Java SE 6 技術手冊》呢？就我目前來看它，真的就像是筆記，然而就因為是筆記，想法、口吻、脈絡甚至範例上，都比較適合新手，在靜靜地留在我硬碟近兩年，我有一天看到它，想說放著也是沒用，不如開放它 ... 

在將《Java SE 6 技術手冊》重新使用 Markdown 排版的過程中，我盡量保留內容原貌，努力忍住不去修改內容，目的很簡單，如果你覺得有任何覺得過時或不妥的地方，就去俢改它 ...

每章的〈網路資源〉被我拿掉了，因為不少鏈結年代久遠已經失效，我懶得一個一個去檢查還有哪些鏈結活著 ... XD

為什麼選擇用 Markdown？只是單純把文件重新排版太無聊了，不如趁這個機會學些新東西，所以我就藉這個機會來學著用 Markdown，並看看它有什麼好處與壞處 ... 如果你需要其他的格式，我相信你可以找到工具從 Markdown 格式轉換過去 :)

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
 
- 第 9 章 管理類別檔案
 - 9.1 內部類別
 - 9.2 package 與 import
 - 9.3 接下來的主題
 
待續 ...