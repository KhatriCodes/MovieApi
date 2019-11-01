**MovieApi**

It is a Main Application Which will call [**MovieDetailApi**](https://github.com/KhatriCodes/MovieDetailApi/tree/develop) and [**MovieRatingApi**](https://github.com/KhatriCodes/MovieRatingApi/tree/develop) Microservice and collaborate Result

**MovieDetailApi** This Microservice will provide **movie name** and **description of movie**.

**MovieRatingApi** This Microservice will provide **rating** for the movie.

This is the API we have to hit with any movie Name. "http://localhost:8085/MovieApi/{movieName}"
  
As of now to demonstrate we have hardcoded two movies rating in MovieRatingApi i.e **Titanic** and **Braveheart** for that we will get 5 and 4 rating and description from MovieDetailApi for this two movies for other movies it will return **default rating 3** and default description **detail not found in data base**

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



