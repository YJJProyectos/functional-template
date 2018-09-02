(ns exercise10-test
  (:require [clojure.test :refer :all]
            [exercise10 :refer :all]))

(deftest fvariance-for-list-of-numbers
  (testing "Returns the variance of a list of numbers."
    (is (= (fvariance '(1 2 3 4 5 6)) (/ 35 12)))))

(deftest fvariance-for-list-of-numbers-2
  (testing "Returns the variance of a list of numbers."
    (is (= (fvariance '(17 15 23 7 9 13)) (/ 166 6)))))
