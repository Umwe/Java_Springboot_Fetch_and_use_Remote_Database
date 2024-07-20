# Java_Springboot_Fetch_and_use_Remote_Database
this is approach of using a remote database using API instead of tradition Object relation Mapping approach

## Define a RestTemplate or WebClient Bean:
Use RestTemplate or WebClient to call the external API. RestTemplate is simpler and synchronous, while WebClient is more flexible and supports reactive programming.

## Service Class:
Create a service class that uses the RestTemplate or WebClient to perform the CRUD operations by calling the external API.

## Model Classes:
Define model classes that represent the data returned by the API. These are not entity classes mapped to a database but simple POJOs (Plain Old Java Objects) for deserialization.

## Controller Class:
Create controller classes to handle incoming requests and delegate the operations to the service class.

# Explanation:
RestTemplate Bean: The AppConfig class defines a RestTemplate bean that can be autowired into other classes.
Service Class: The ApiService class uses RestTemplate to call the external API endpoints for CRUD operations.
Model Class: The DataModel class represents the data structure returned by the API.
Controller Class: The DataController class handles HTTP requests and delegates the operations to the ApiService.
This approach allows your Spring Boot application to interact with a database through an external API, avoiding the need for direct database access and entity classes.
