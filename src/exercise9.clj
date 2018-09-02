(ns exercise9)
(defn things
  [x]
  (if  (string? x)
    "Soy un String"
    ( if (vector? x)
      "Soy un Vector"
      ( if ( map? x)
        "Soy un Map"
        ( if (list? x )
          "Soy un List"
          "Soy un default"
          )
        )
      )
    )

  )