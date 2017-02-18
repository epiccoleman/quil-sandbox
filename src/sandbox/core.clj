(ns sandbox.core
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn draw [state]
  ; Clear the sketch by filling it with black color.
  (q/background 0 0 0)
  (q/no-stroke)
  ; Set shape color.
  (q/fill 255 0 0)
  (q/rect 300 300 50 50)   

  (q/fill 0 255 0)
  (q/ellipse 200 200 50 50) 

  (q/fill 0 0 255)
  (q/triangle 75 75 50 100 100 100)
)

(q/defsketch sandbox
  :title "sandbox"
  :size [500 500]
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


(defn draw-circles [state]
  (q/background 0 0 0)

  (q/with-translation [ (/ (q/width) 2)
                        (/ (q/height) 2) ]
  (doseq [ x (range 0 700 10 ) ]

  (q/stroke (+ 128 (rem x 128))  0 0)
  (q/no-fill)
  (q/ellipse 0 0 x x)))
)

