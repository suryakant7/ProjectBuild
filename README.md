# ProjectBuild
Hotel Reservation is a web based project. In the website you can signup and get a new account of your own and login, every account can book, update and delete reservation form baisically implementing create, read, update, and delete i.e., (CRUD) features. We are trying to showcase our knowledge. Hence we are using Spring Framework in java, Spring Boot in back-end with Thymeleaf template engine to manage front-end, In addition we include Spring Security to handle authentication and authorization, and Java Persistence API (JPA) with entity manager to handle MySql connector with database. Entity classes are defined with Two Structural Pattern for Services and dao is followed, and using Maven build tool we mange project architecture for classes, resources and dependencies. 



* Login or Signup
 
 You can’t open any another page without sign in, you will directly transfer automatic to this page.

![1 LoginPage](https://user-images.githubusercontent.com/78878627/114337469-c0e6ef80-9b6e-11eb-8516-f43bacdd68ca.jpg)



* Home Page

  There are many sections about the hotel to view it and information about it, Rooms, Services, Review. Etc It’s a full page with header and content and footer. You can use features like, Log Out, New Reservation or view logged in user reservations.


![2 HomePage](https://user-images.githubusercontent.com/78878627/114337558-ed027080-9b6e-11eb-96ee-b4361ed7628f.jpg)



* Room View 

![3 Room View](https://user-images.githubusercontent.com/78878627/114337719-45d20900-9b6f-11eb-92fb-0d1cd347fb94.jpg)



* Services Offered by us

![4 Services offered](https://user-images.githubusercontent.com/78878627/114337756-57b3ac00-9b6f-11eb-8859-b6cd425f7d09.jpg)



* Hotel Room gallery view

  Auto-scroll gallery will enhance your experience of our project view
  
![5 Hotel Rooms Gallery View](https://user-images.githubusercontent.com/78878627/114337816-71ed8a00-9b6f-11eb-9e62-880cfa299cd3.jpg)



* Footer

  Creater information is given in this footer section
  
![6 About us footer](https://user-images.githubusercontent.com/78878627/114337876-9184b280-9b6f-11eb-8e84-82430d93cc54.jpg)

  
  
* Booking Form
  
  Reservations page, here you can book a room. Here is a form that you can choose your required choices, with live price counter.

![7 Booking Form](https://user-images.githubusercontent.com/78878627/114337949-b37e3500-9b6f-11eb-99fa-ebd1ecbac02b.jpg)



* List of your reservation

  In this page you can modify your reservation and see list of user logged in reservations and can delete it or can update it with another choices.
  
![8 Your Reservation](https://user-images.githubusercontent.com/78878627/114337985-c2fd7e00-9b6f-11eb-8ffa-9f7942ec97f8.jpg)


## Coading Part!!!

* Maven Build Tool : For managing the file structure

![1 maven build tool](https://user-images.githubusercontent.com/78878627/115064995-36561580-9f0b-11eb-8845-97e8a017cea4.jpg)



* Data Access Object Pattern (DAO):

It’s a pattern that use to deal with retrieve data from database and to save data too. Example: Reservation Dao Implementation Class.

![4 dao](https://user-images.githubusercontent.com/78878627/115065023-4110aa80-9f0b-11eb-8aad-a648765c18df.jpg)



* Service Pattern:

It’s a pattern used between DAO and Controller that’s modify data, manage the service inventory, manage transactional and control all database layers to handle requests between server and client. Example: Reservation Service Implementation Class.

![5 service](https://user-images.githubusercontent.com/78878627/115065035-466df500-9f0b-11eb-8b88-c6bfaf82ff8b.jpg)



* Entity Package:

It’s the Java POJOs classes that represents a stored table in database, entity annotation scan it so can connect with entity manager (JPA) in DAO pattern. Example: Reservation (Entity Class).

![6 entity pkg](https://user-images.githubusercontent.com/78878627/115065100-5b4a8880-9f0b-11eb-9528-177e7a822ec6.jpg)



* Temporary Package:

This package for handle data input and match client inputs with required data, save data temporary in this class and after checking it using service pattern we pass it to entity classes. Example: Current Reservation Class.

![7 temp](https://user-images.githubusercontent.com/78878627/115067467-9a2e0d80-9f0e-11eb-8fa6-3c1ca4f62e0e.jpg)



* Validation Package:

It’s some custom annotations with custom pattern regex or custom feature required to match data input with required data in Temporary Package. Example: Field Match Annotation.

![8 valadation](https://user-images.githubusercontent.com/78878627/115065124-61d90000-9f0b-11eb-9083-f3337378a356.jpg)



Controller Package:

Controller is a Model View Controller (MVC) that’s handle the developing of user interfaces. Example: Hotel Reservation Controller Class.

![9 controller](https://user-images.githubusercontent.com/78878627/115065142-669db400-9f0b-11eb-90f1-57c6b6fb3d8b.jpg)



* Security Package:

It’s a Spring Security class that handle the authentications and authorizations of the project and manage client and his role. Manage login and logout operations and all security features. Example: Security Config Class.

![10 security](https://user-images.githubusercontent.com/78878627/115065160-6bfafe80-9f0b-11eb-8cb1-b93c5f1b0013.jpg)








