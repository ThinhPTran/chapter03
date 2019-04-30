(ns learncrashcourse.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn testif
  "To test if"
  []
  (if true
    (do 
      (print "thinh")
      "thinh")
    (do
      (print "khoa")
      "khoa")))

(defn testwhentrue
  "Test when, will run both print and 'Khoa'"
  []
  (when true
    (print "thinh")
    "khoa"))

(defn testwhenfalse
  "Test when, will return nil"
  []
  (when false
    (print "thinh")
    "khoa"))

(defn checknil?
  "nil? is used to check nil"
  []
  (do 
    (println (nil? 1))
    (println (nil? nil))))

(defn checkor
  "or return first true or the last"
  []
  (do 
    (println (or false nil :large_i_mean_venti :why_cant_I_just_say_large))
    (println (or (= 1 0) (= "yes" "no") nil))))  

(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer"])

(defn error-message
  [severity]
  (str "OH GOD! IT's A DISASTER! WE'RE "
    (if (= severity :mild)
      "MILDLY INCONVENIENCED!"
      "DOOOOOOOOOOOMED!")))

(defn DefineAHashmap
  "Let's define a hashmap"
  []
  (hash-map :a 1 :b 2))

(defn TestHashset
  "Test Hashset"
  []
  (hash-set 1 1 2 2))

(defn TestMultiArity
  "To test multi-arity"
  ([first-arg second-arg third-arg]
   (println (str first-arg second-arg third-arg)))
  ([first-arg second-arg]
   (println (str first-arg second-arg)))
  ([first-arg]
   (println (str first-arg))))

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper))

(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(defn favorite-things
  [name & things]
  (str "Hi, " name, ", here are my favorite things: "
    (clojure.string/join ", " things)))

(defn my-first
  [[first-thing]]
  first-thing)










