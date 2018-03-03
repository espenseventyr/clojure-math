(ns math.core
  (:use [uncomplicate.neanderthal core native]))

(defn f [x]
  (+ (Math/cos x) 1))

(defn f-prime [x]
  (- (Math/sin x)))

(defn newtons-method [x]
  (- x (/ (f x) (f-prime x))))

(take-last 1 (take 25 (iterate newtons-method 2)))
(Math/PI)

;;-------------------------------

(def A (dge 9 9 [-4 1 0 1 0 0 0 0 0
                 1 -4 1 0 1 0 0 0 0
                 0 1 -4 0 0 1 0 0 0
                 1 0 0 -4 1 0 1 0 0
                 0 1 0 1 -4 1 0 1 0
                 0 0 1 0 1 -4 0 0 1
                 0 0 0 1 0 0 -4 1 0
                 0 0 0 0 1 0 1 -4 1
                 0 0 0 0 0 1 0 1 -4]))

(def B (dge 9 1 [-100 -20 -20 -80 -0 -0 -260 -180 -180]))
