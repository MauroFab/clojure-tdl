(ns futurej.core
  (:gen-class))

(defn -main
  
  [& args]

  
  ;(future (Thread/sleep 4000)(println "I'll print after 4 seconds")))
  
  ; (println "I'll print immediately")
  
  
  ; funcion recurrente sencilla
  (defn sum-mundane [x y]
    (if (= 0 y)
      x
      (recur (inc x) (dec y))))
  
  ;llamada secuencial
  (defn secuencial [x]
    (sum-mundane 1 x)
    (sum-mundane 1 x)
    (sum-mundane 1 x)
    (sum-mundane 1 x)
    (sum-mundane 1 x)
    (sum-mundane 1 x))
  
  ;llamada concurrente
  (defn concurrente [x]
    (def fa (future(sum-mundane 1 x)))
    (def fb (future(sum-mundane 1 x)))
    (def fc (future(sum-mundane 1 x)))
    (def fd (future(sum-mundane 1 x)))
    (def fe (future(sum-mundane 1 x)))
    (def ff (future(sum-mundane 1 x)))
    (seq[@fa @fb @fc @fd @fe @ff]))
  
  
  (println(time(secuencial 123456789)))  
  (println(time(concurrente 123456789)))) 
 

  
  
