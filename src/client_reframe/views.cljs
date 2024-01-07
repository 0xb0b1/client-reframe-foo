(ns client-reframe.views
  (:require
   [re-frame.core :as re-frame]
   [client-reframe.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name]
     ]))
