# emojinius

A Clojure library designed to explore strange new words, to seek out new scripts and new characters, to boldly code in a charset no man has coded in before.

Write clojure code using emoji.

![Emojinius](http://www.eikeland.se/other/emojinius.png)

## Example

* `cycle` : 🚴
* `take` : 👊
* `10` : 🔟

```clojure
emojinius.core=> (def 🏁 (🚴 [:🚙 :🚗 :🚕 :🚓 :🚜]))
emojinius.core=> (👊 🔟 🏁)
-> (:🚙 :🚗 :🚕 :🚓 :🚜 :🚙 :🚗 :🚕 :🚓 :🚜)
```

* `loop` : 🔁
* `recur` : ⤴
* `*` : ✖
* `-` : ➖
* `println` : 📠
* `when` : ⌚-❓

```clojure
(🔁 [💵 (✖ 🔟 🔟)]
    (⌚-❓ (> 💵 🔟)
          (📠 💵)
          (⤴ (➖ 💵 🔟))))
```

## Other

Pull requests and dogecoins welcome. (DM3oLs8QcAaMu5UtYrroWjeKBiaTqevPzj)

## License

Copyright © 2014 Stian Eikeland

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
