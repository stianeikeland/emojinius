;; ## Emoji-mappings for clojure

(ns emojinius.core)

;; # Bool
(def 👍 true)
(def 👎 nil)

;; # Numbers
(def 🔟 10)
(def 🔢 num)

;; # Math
(def ✖ *)
(def ➕ +)
(def ➖ -)
(def ➗ /)

;; # Sequences
(def 🔀 interleave)
(def 🚴 cycle)
(def 👊 take)
(def 😻 concat)
(def 🌍-🐈 mapcat)
(def #^{:macro true} 💤-🐈 #'lazy-cat)
(def 🌍 map)
(def 🛃 filter)

;; # String
(def 🔤 str)
(def 📠 println)

;; # Functions
(def #^{:macro true} ▶ #'->)
(def #^{:macro true} ⏩ #'->>)
(def 🆔 identity)
(def #^{:macro true} ⌚-❓ #'when)

;; # Maps
(def 🔑 keys)

;; # Concurrency
(def 👛 atom)
(def 👤 agent)

;; # Special
(def #^{:macro true} 🔁 #'loop)
(defmacro ⤴ [& args] `(recur ~@args))

;; # Java interop
;(def 🆕 new)
