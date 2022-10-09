(ns duplicate-encoder
  (:require [clojure.string :as str]))

(defn encode-dups [text]
  (let [lower-text (str/lower-case text)
        count-map (frequencies lower-text)]
    (->> (map #(if (> (get count-map %) 1) ")" "(") lower-text)
         (apply str))))

(comment
  (encode-dups "aabbcDdE"))
