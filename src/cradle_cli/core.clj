(ns cradle_cli.core
  (:gen-class)
  (:use clojure.contrib.command-line)
  (:use cradle.core))

(defn -main [& functions]
  (load-file "build.clj")
  (if functions
    (doseq [the-function (map symbol functions)]
      (eval (list the-function)))
    (println "Arguments required.")))
