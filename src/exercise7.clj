(ns exercise7)
(defn fmap
  [x y]
  ( if ( map? y )
    (apply merge
           (map (fn [[k v]] {k (x v) }) y))
    (if (list? y )
      (map x y)
      (if (vector? y)
        (into [] (map x y) )
        "default"
        )
      )
    )
  )