(ns wonderland.core
  (:require [clojure.set :as cs]))

;; Using function expression just to get some reps in
(def same-fav-foods (fn [fav-foods1 fav-foods2]
  (let [food-set-1 (set fav-foods1)
        food-set-2 (set fav-foods2)
        common-foods (cs/intersection food-set-1 food-set-2)]
    (str "Common foods: " common-foods))))

(same-fav-foods [:toast :blueburry :orange] [:orange :toast :pnut-butter])

;; function that lets you know if a given number is greater than zero
(def greater-than-zero (fn [num]
                         (< 0 num)))

;; lists to use in butterfly of the day function
(def butterflies '("Milbert's tortoiseshell" "The Zebra Swallowtail" "Red Admiral Monarch Butterfly" "Karner Blue Butterfly"))
(def week-days '("Monday" "Tuesday" "Wednesday" "Thursday" "Friday"))
;; function that returns day of week plus its butterfly

(def butterfly-of-the-day (fn []
                            (for [day week-days butterfly butterflies]
                              (str day " is " butterfly " day!")
                             )))
