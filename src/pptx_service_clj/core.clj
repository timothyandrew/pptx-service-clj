(ns pptx-service-clj.core
  (:import [org.apache.poi.xslf.usermodel XMLSlideShow XSLFSlide])
  (:gen-class))

(defn create []
  (doto (XMLSlideShow.)
    (.createSlide)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
