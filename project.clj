(defproject pptx-service-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.apache.poi/poi "3.13"]
                 [org.apache.poi/poi-ooxml "3.13"]]
  :main ^:skip-aot pptx-service-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
