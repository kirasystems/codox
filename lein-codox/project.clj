(defproject kirasystems/lein-codox "0.10.4"
  :description "Codox Leiningen plugin"
  :url "https://github.com/kirasystems/codox"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[kirasystems/leinjacker "0.4.3"]]

  :repositories [["releases" {:url "https://clojars.org/repo"
                              :sign-releases false
                              :username :env
                              :password :env}]])
