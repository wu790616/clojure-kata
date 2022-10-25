(ns best-travel)

;; (defn choose-best-sum [t k ls])
;;
;; (comment
;;   ((choose-best-sum 163, 3, [50, 55, 56, 57, 58])))

(defn combinations [k ls]
  (cond
    (= k 0)     [[]]
    (empty? ls) []
    :else (concat (map #(conj % (first ls))
                       (combinations (dec k) (rest ls)))
                  (combinations k (rest ls)))))

;; How to get all combinations:
;;
;; 1. k = 1 => [[50] [55] [56] [57] [58]]
;; 2. k = 0 => [[]]
;; 3. ls = [] => []
;; 4. k = 3 / ls = [50 55 56 57 58]
;;    => [[50] + [55 56 57 58]/2]] + [55 56 57 58]/3
;;    => [[50] + ([55] + [56 57 58]/1) + ([56 57 58]/2)] + [55 56 57 58]/3
;;    => ......))
(comment
  (concat (map #(conj [55] %) [56 57 58])
          (concat (map #(conj [56] %) [57 58]) [[57 58]]))
  (combinations 3 [50 55 56 57 58]))
