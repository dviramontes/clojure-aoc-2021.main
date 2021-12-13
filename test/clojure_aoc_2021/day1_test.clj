(ns clojure-aoc-2021.day1-test
  (:require [clojure.test :refer :all]
            [clojure-aoc-2021.day1 :refer :all]))

(deftest day1
  (testing "part 1"
    (testing "count # of increments"
      (let [input-increments (load-input "day1")]
        (is (= 7 (count-increments test-increments)))
        (is (= 1713 (count-increments input-increments))))))

  (testing "part 2"
    (testing "count # of increments"
      (let [input-increments (load-input "day1")]
        (is (= 5 (count-sums-increments test-increments)))
        (is (= 1734 (count-sums-increments input-increments)))))))
