(defproject discord_qc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "FIXME"
            :url "FIXME"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.github.discljord/discljord "1.3.1"]
                 [com.github.johnnyjayjay/slash "0.6.0-SNAPSHOT"]
                 [cheshire "5.11.0"]
                 [camel-snake-kebab "0.4.3"]
                 [com.rpl/specter "1.1.4"]
                 [http-kit "2.8.0-beta3"]
                 [org.clojure/math.combinatorics "0.2.0"]
                 [com.datomic/local "1.0.267"]
                 [philoskim/debux "0.9.0"]

                 [org.clj-commons/byte-streams "0.3.4"]
                 [org.rocksdb/rocksdbjni "8.6.7"]]
                 
  :repl-options {:init-ns discord-qc.core}
  :main discord-qc.core)
