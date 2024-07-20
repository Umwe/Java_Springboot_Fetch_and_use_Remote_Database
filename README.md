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
