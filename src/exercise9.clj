(ns exercise9)

(defmulti things type)

(defmethod things java.lang.String [x] "Soy un String" )
(defmethod things clojure.lang.PersistentArrayMap [x] "Soy un Map" )
(defmethod things clojure.lang.PersistentList [x] "Soy un List" )
(defmethod things clojure.lang.PersistentVector [x] "Soy un Vector" )
(defmethod things :default [x] "Soy un default" )