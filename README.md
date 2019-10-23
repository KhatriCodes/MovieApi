**MovieApi**

It is a Main Application Which will call **MovieDetailApi** and **MovieRatingApi** Microservice and collaborate Result

**MovieDetailApi** micro service will provice movie name and description of movie.

**MovieRatingApi** micro service will provice rating for the movie.

This is the API we have to hit with any movie Name. "http://localhost:8085/MovieApi/{movieName}"
  
Only Two movies rating are hardcoded in MovieRatingApi i.e **Titanic** and **Braveheart** for that we will get 5 and 4 rating and description from MovieDetailApi for this two movies for other movies it will return **default rating 3** and default description **detail not found in data base**

For Example

http://localhost:8085/MovieApi/titanic

Response:
{"movierating":5,"movieName":"Titanic","desc":"Beautiful Love Story"}

http://localhost:8085/MovieApi/Braveheart

Response:
{"movierating":4,"movieName":"Braveheart","desc":"Brave Story"}

http://localhost:8085/MovieApi/AnyOtherMovie

Response:
{"movierating":3,"movieName":"AnyOtherMovie","desc":"Don't have description in data base"}



