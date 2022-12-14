(ns sum-consecutives-test
  (:require [clojure.test :refer :all]
            [sum-consecutives :refer [sum-consecutives]]))

(deftest a-test1
  (testing "Basic tests"
    (is (= (sum-consecutives [1,4,4,4,0,4,3,3,1]) [1,12,0,4,6,1]))
    (is (= (sum-consecutives [1,1,7,7,3]) [2,14,3]))
    (is (= (sum-consecutives [-5,-5,7,7,12,0]) [-10,14,12,0]))))
