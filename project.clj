(defproject image-server "0.1.0-SNAPSHOT"
  :description "Simple server which caches image requests"
  :url "https://github.com/Gira-X/clj-basic-image-cache-server"
  :min-lein-version "2.0.0"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [http-kit "2.2.0"]
                 [digest "1.4.5"]
                 [base64-clj "0.1.1"]
                 [com.taoensso/timbre "4.8.0"]
                 [commons-validator "1.5.1"]]
  :main ^:skip-aot image-server.core
  ; note the :aot, we do not want to include the scraper
  :profiles {:uberjar {:aot [image-server.core
                             image-server.utils
                             image-server.randomimages]}
             ; used in Travis CI
             :dev {:plugins [[jonase/eastwood "0.2.3"]
                             [lein-kibit "0.1.3"]]}})
