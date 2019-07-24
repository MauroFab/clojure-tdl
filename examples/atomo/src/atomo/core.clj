(ns atomo.core
  (:gen-class))

(defn -main
  
  [& args])

  
(def contador ( atom 0))

; swap! actualiza el atomo, primer argumento el atomo, segundo una funcion
( defn inc-contador []
 ( swap! contador inc)) 


(inc-contador) ;1
(inc-contador) ;2
(inc-contador) ;3
;desreferencio el atomo
(println @contador) 
  
  
  
  
  
  
  
