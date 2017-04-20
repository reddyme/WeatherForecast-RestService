# WeatherForecast - Restful Web Service

**This is Restful Web Service page which functions on Historic Weather data**
**Steps followed to create this project:**

1. This project is written on Java on top of Jersey API (JAX-RS)
2. Maven is used as build-in tool.
3. All the operations done in memory, No database is involved.
4. Read the weather data(which is present in resources), performed the following functionalities,  
    (i)  **End Point** =         /historical/ - list of all dates for which weather information is available. JSON array of each date in YYYYMMDD.  
    (ii) **End Point** =         /historical/<dateYYYYMMDD> - Weather information for a particular date. if no information is available - 404 error  
    (iii)**End Point** =         /historical/ - Add weather information for a particular day.  
    (iv) **End Point** =         /historical/<dateYYYYMMDD> - Delete weather info a particular day.  
    (v)  **End Point** =         /forecast/<dateYYYYMMDD> - Weather forecast for next 7 days - the date could be an existing date or future date.  

#Weather Data Analysis:
#####Return all Historical Records
**URL**
http://34.210.24.117:8080/RestWebService/rest/weather/historical/  
**Method:**
GET  
**URL Params**
None  
**Success Response:**  
Code: 200   
Content: [    
   {"date": "20130101"},  
   {"date": "20130102"},  
   {"date": "20130103"},  
   {"date": "20130104"},  
   {"date": "20130105"},  
   {---},{---},--  
   {"date": "20170209"}  
   ]  
#####Return Weather Record for a given date
**URL**  
http://34.210.24.117:8080/RestWebService/rest/weather/historical/:date  
**Method:**  
GET  
**URL Params**  
**Required**  
date=[string]  
**Success Response:**  
Code: 200  
Content: {  
   "date": "20170110",  
   "tmax": 53,  
   "tmin": 35.5  
}  
**Error Response:**  
Code: HTTP/1.1 404 Not Found  

#####Create a new weather record  
**URL**  
http://34.210.24.117:8080/RestWebService/rest/weather/historical/  
**Method:**  
POST  
**URL Params**  
None  
**Raw Input**  
**Required**  
{  
   "date": "20170110",  
   "tmax": 53,  
   "tmin": 35.5  
}  
**Success Response:**  
Code: HTTP/1.1 201 Created  
Content: {"date":"20130101"}  

#####Delete Weather Record for given date  
**URL**  
http://34.210.24.117:8080/RestWebService/rest/weather/historical/:date  
**Method:**  
DELETE  
**URL Params**  
**Required**  
date=[string]  
**Success Response:**  
Code: HTTP/1.1 200 OK  
Content: Record With Date: 20130101 Deleted  
**Error Response:**  
Code: HTTP/1.1 404 Error - Record Not Found  

##### Return future 7 predicted records for a given date  
**URL**  
http://34.210.24.117:8080/RestWebService/rest/weather/forecast/:date  
**Method:**  
GET  
**URL Params**  
**Required**  
date=[string]  
**Success Response:**  
Code: HTTP/1.1 200 OK  
Content: [  
      {  
      "date": "20130102",  
      "tmax": 29.5,  
      "tmin": 15  
   },  
      {  
      "date": "20130103",  
      "tmax": 34.5,  
      "tmin": 12  
   },  
      {  
      "date": "20130104",  
      "tmax": 36.5,  
      "tmin": 23  
   },  
      {  
      "date": "20130105",  
      "tmax": 41,  
      "tmin": 19  
   },  
      {  
      "date": "20130106",  
      "tmax": 40,  
      "tmin": 28  
   },  
      {  
      "date": "20130107",  
      "tmax": 39.5,  
      "tmin": 19  
   },  
      {  
      "date": "20130108",  
      "tmax": 50,  
      "tmin": 20  
   }  
]  

#Final URL's after the deployment
## Return all Historical Records
http://34.210.24.117:8080/RestWebService/rest/weather/historical/
## Return Weather Record for a given date
http://34.210.24.117:8080/RestWebService/rest/weather/historical/20130102
## Create a new weather record
http://34.210.24.117:8080/RestWebService/rest/weather/historical/
#####Raw Input
{
   "date": "20190110",
   "tmax": 53,
   "tmin": 35.5
}
## Delete Weather Record for given date
http://34.210.24.117:8080/RestWebService/rest/weather/historical/20190101
## Return future 7 predicted records for a given date
http://34.210.24.117:8080/RestWebService/rest/weather/forecast/20130102
