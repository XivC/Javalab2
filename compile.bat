javac -target 8 -source 8 -cp ;lib/Pokemon.jar com/lab2/Lab2.java com/lab2/customs/pokemons/*.java com/lab2/customs/attacks/*.java com/lab2/battlegrounds/*.java
jar cfm lab2.jar MANIFEST.MF com/lab2/*.class com/lab2/battlegrounds/*.class com/lab2/customs/attacks/*.class com/lab2/customs/pokemons/*.class lib
java -jar lab2.jar
pause