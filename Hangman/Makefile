compile:
	rm -rf bin/
	javac -d bin Main.java
	jar cvfe Hangman.jar Main -C bin .
	chmod 700 Hangman.jar
	java -jar Hangman.jar