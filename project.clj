(defproject turtle "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [net.sf.beaver/beaver-ant "0.9.9"]]

  :plugins [[lein-beaver "0.1.2-SNAPSHOT"]
            [lein-pprint "1.1.1"]]

  :prep-tasks ["beaver" "javac" "compile"]

  :source-paths ["src/main/clj"]
  :test-paths ["src/test/clj"]
  :java-source-paths ["src/main/java" "target/src"]

  :grammar-src-dir "src/main/grammar"
  :grammar-dest-dir "target/src/"

  :main crg.turtle.core)