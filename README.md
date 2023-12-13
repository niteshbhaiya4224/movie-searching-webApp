# Movie Searching Web App
A web application that allows users to search for movies using the OMDB API and view them using Thymeleaf.

<!--[DemoLink](https://movie-searching-webapp-production.up.railway.app/)-->

## Description
This project is a Spring Boot web application that allows users to search for movies using the OMDB API. The application allows users to search for movies by title, and displays the results in a list. Users can also view the details of the movie like rating , genre, actor, director and many more. The frontend of the application is built using Thymeleaf.

## Sample ScreenShot

![image1](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj9ZJwmdr1eDJzPFCgHGY9iyNfSWoUvtCw2RecaYacGXTBlL1O2qJkAU_urJ16X9HRjXVV2oz4VOwqqx5LrvnDWXB-pkfcdfirlNFClzydebep9OFCt_9pa5Lst9VB3srGJgl1fpWOn2fvjy3MMWWsyvcaz2-GaF1fb-xXtK-m6m7wxAjreWV_j72md/s1920/Movie%20DB%20-%20Google%20Chrome%2009-12-2023%2023_13_44.png)

![image2](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjG2XRGQ_aa6gPpkc_Q3JKA6qIPmx_VtS0uLYygX4wbDiTA9no2iOhRLGXCsrlwO-yunYRMtRQ1D6iEB41mgO7OGHHqtpR88mBpdeHRG8RkK2Q_WNQ7VN-nhDKzCbzLPZjDr5q99xphOO7_qIhzQItH_CGp1J7IsPDmQdKTCR2DFinpYDE86KIrGt4A/s16000/Movie%20DB%20-%20Google%20Chrome%2009-12-2023%2023_15_25.png)

![image3](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjJA6hfdJZ9poK1VKBvD2iormqoDwz-_P5oAMH1WrGesVgXy1E1itciikmKEqSozmlPKI_m6LaW10KHJPRufldE5g9wNhHvruT1mr-ttDoG2xF0Wm2HB7wjIGCcO1EEnHbHF6YNXnscKGsbhLkxETJeP8CUjUN07oqBKDHGNBT2lc1401U7Efeq1QTr/s16000/Movie%20DB%20-%20Google%20Chrome%2009-12-2023%2023_15_35.png)

![image4](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhk7_4x4hFU5sZ5-rHv1Dn13gR6ULBvKfgE53RqyhkEzXsrg7eY2ugy9ENPUIgj-WgT_a2r5ICMH38aQwLODHq_Jl-1EzG1cublzhOjhhk2synFC7kZpY-YQfzmg0NyoolQxuLeRFASW-SM43WZX9byyvQGDuz0Vx36XP7ZEPU4a58auiU7y7lBNH9q/s16000/Movie%20DB%20-%20Google%20Chrome%2009-12-2023%2023_15_44.png)

![image5](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiRN3Q9f8lrfizsCyDBz2PekzcIuh4vUgdY_JM0-1bMpEInen2jy8llcHbug4S-12scp0slTRaiiyCv8TwOUcMcrEEwExmNl0ZiM6UCxXkuV_cVYUXz-dQOecWhmqQMn8uishj46iVjatOpKE7rPLN9WEE9osU8eXPcCgfq2FwWf9oOjlYA9iAkJiYJ/s16000/Movie%20DB%20-%20Google%20Chrome%2009-12-2023%2023_15_54.png)

![image6](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhE4gWBSI7VcBIAJzO6WZHNmQx1Tl_DunX0BAI3EhbQ5a5FFlCTNtiGduvFuugzpoC2o52hxl6gP_b1FDCVe8rwz9BfzDn2EB8zcJkly0PqNHFxEDJVtTs1ptPCEFInLvtDA4Jq76t_dbLYZBVVe_48T31byDqjjpzakiy-e-18qo1c5srOkzCW3wQe/s16000/Movie%20DB%20-%20Google%20Chrome%2009-12-2023%2023_16_08.png)

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Java 8 or higher
- Spring Boot 2.3.0 or higher
- OMDB API key (You can get the API key from http://www.omdbapi.com/)

### Installation
1. Clone the repository to your local machine git clone https://github.com/yourusername/movie-searching-webApp.git
2. Open the project in your preferred IDE
3. Add your OMDB API key in the MovieService.java file
4. Build and run the application

### Running the Application
You can run the application by executing the main class, or by using the following command in the root directory of the project:
./mvnw spring-boot:run

### Deployment
The application can be deployed to a production environment by building a jar file and running it on a web server such as Tomcat.

### Built With
- Spring Boot
- Thymeleaf
- OMDB API

### Contributing
If you want to contribute to this project, please create a pull request with a detailed explanation of your changes.

### Versioning
This project uses Git for versioning.

### Authors
- Nitesh Bhaiya

