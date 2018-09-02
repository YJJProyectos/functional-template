(ns exercise10)
(defn faverage
  [numbers]
  ( let [numeros ( into [] numbers) ]
    ( / (apply + numeros) (count numeros) )
    )
  )
(comment
  (defn fvariance
  [x]
  ( let [
         promedio (faverage x)
         resta ( map #(- % promedio) x)
         potenciado ( map #(* % %)  resta )
         sumatoria ( apply + potenciado )
         ]
    " (list promedio resta potenciado sumatoria) "
    (/ sumatoria (- (count x) 1) )
    )
  )
  )

(defn fvariance
  [x]
  ( let [
         promedio (faverage x)
         resta ( map #(- % promedio) x)
         potenciado ( map #(* % % )  resta )
         sumatoria ( apply + potenciado )
         ]
    (/ sumatoria (count x) )
    )
  )