(defproject taskmaster "0.0.3-SNAPSHOT-1"
  :description "Background publisher/consumer on top of Postgres, next.jdbc and hikari-cp"
  :url "https://github.com/lukaszkorecki/taskmaster"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[nomnom/utility-belt.sql "1.0.0.beta1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.logging "1.0.0"]
                                  [com.stuartsierra/component "1.0.0"]
                                  [ch.qos.logback/logback-classic "1.2.3"]
                                  [nomnom/utility-belt "1.2.2"]
                                  [org.clojure/clojure "1.10.1"]]
                   :resource-paths ["dev-resources"]}}
  :deploy-repositories {"clojars" {:sign-releases false
                                   :username :env/clojars_username
                                   :password :env/clojars_password}})
