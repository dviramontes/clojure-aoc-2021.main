(ns clojure-aoc-2021.day1
  (:require [clojure.java.io :as io]
            [clojure.string :as string]))

(def test-increments [199 200 208 210 200 207 240 269 260 263])

(defn load-input [day]
  (->> (io/resource (str "input/" day ".txt"))
       slurp
       (string/split-lines)
       (map #(Integer/parseInt %))))

(defn count-increments
  "returns count of linear increments"
  [input]
  (->> input
       (partition 2 1)
       (filter (fn [[x y]] (< x y)))
       (count)))

(defn count-sums-increments
  "returns sums of three measurements sliding window"
  [input]
  (->> input
       (partition 3 1)
       (map #(reduce + %))
       count-increments))

(comment
  (let [t1 test-increments]
    (count-increments t1)
    (count-sums-increments t1)))