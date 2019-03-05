(ns wonderland.core
  (:require [clojure.set :as cs]))

;; Using function expression just to get some reps in
(def same-fav-foods (fn [fav-foods1 fav-foods2]
  (let [food-set-1 (set fav-foods1)
        food-set-2 (set fav-foods2)
        common-foods (cs/intersection food-set-1 food-set-2)]
    (str "Common foods: " common-foods))))

(same-fav-foods [:toast :blueburry :orange] [:orange :toast :pnut-butter])

