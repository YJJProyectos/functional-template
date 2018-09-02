(ns exercise6)
(defn faverage
  [numbers]
  ( let [numeros ( into [] numbers) ]
    ( / (apply + numeros) (count numeros) )
    )
  )