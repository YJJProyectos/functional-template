(ns exercise7)
(comment defn fmap
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

(defmulti fmap (fn [x y]  (type y) ) )
(defmethod fmap clojure.lang.PersistentList [x y] (map x y) )
(defmethod fmap clojure.lang.PersistentVector [x y] (into [] (map x y) ))
(defmethod fmap clojure.lang.PersistentArrayMap [x y]
  (apply merge
         (map (fn [[k v]] {k (x v) }) y))
  )
(defmethod fmap :default [x y] x)