(comment  (ns exercise11)
(defn fmap-nil
  [x y]
  ( let [value  (get x y ) ]
    ( if (nil? value)
      true
      false
      )
    )
  )
)

(ns exercise11)
(defn fmap-nil
  [x y]
  ( let [value  (get x y ) ]
    (nil? value)
    )
  )