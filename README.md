**MovieApi**

It is a Main Application Which will call **MovieDetailApi** and **MovieRatingApi** Microservice and collaborate Result

This is the API we have to hit with any movie Name. "http://localhost:8085/MovieApi/{movieName}"
  
Only Two movies rating are hardcoded in MovieRatingApi i.e **Titanic** and **Braveheart** for that we will get 5 and 4 rating and description from MovieDetailApi for this two movies for other movies it will return **default rating 3** and default description **detail not found in data base**

For Example

http://localhost:8085/MovieApi/Titanic


http://localhost:8085/MovieApi/Braveheart


http://localhost:8085/MovieApi/AnyOtherMovie


[Screen Shots]()

