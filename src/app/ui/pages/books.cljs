(ns app.ui.pages.books
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            ;;[keechma.next.helix.template :refer [defnt fill-slot configure]]
            [keechma.next.helix.classified :refer [defclassified]]
            [helix.core :as hc]
            [app.db :as db]
            ))

(defnc BooksRenderer [_]
  (d/div
    (d/h2 "Books")
    (for [{:keys [id title author]} db/books]
      (d/div
        (d/h4 title)
        (d/div author)
        ))
    ))

(def Books BooksRenderer)
