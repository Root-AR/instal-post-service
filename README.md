# InstaPost Service

This project was generated with Spring boot


## Steps for running project
    1. import project using maven existing project in your eclipse.
    2. run maven clean install.
    3. run as java application


## Service runs with Mysql as backend Database.
	
	To configure the mysql connection , please provide details in Application.properties file.

	e.g. aplication.properties

	persistence.unit=insta-post

	# LOCAL DB DETAILS
	DB.driverClassName=com.mysql.jdbc.Driver
	DB.url=jdbc:mysql://127.0.0.1:3306/UserPost?user=root
	DB.host=127.0.0.1
	DB.port=3306
	DB.userName=root
	DB.password=root
	DB.schema=UserPost





