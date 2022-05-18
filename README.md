# fullstack-ecommerce-project

This project is part of a course by Chad Darby and Harinath Kuntamukkala of https://www.luv2code.com.
It is an example of building a fullstack single page e-commerce application. The application incorporates aspects such as displaying the sellers wares, taking and transmitting orders and providing tracking numbers for the customer, security and logins, payment systems and receipts, and more.

Chad and Hari provided starter materials including images, html and css files, as well as database scripts to use in MySql Workbench and a SpringBoot application properties file to get moving quickly.

I am excited to use what was learned in this project to build my own application from scratch. Thank you for checking out what I have been learning.

---

---

## Table of Contents

1. Technologies Used
2. Setup
3. Package Layout and Descriptions
4. Future Implementations
5. Video Demonstrations

---

---

# I. Technologies Used

## Frontend

- node.js
- angular
- bootstrap
- html
- css
- vscodium

## Backend

- java
- lombok
- spring boot
- mysql
- postman
- intellij

## Security

- ssl
- okta

## Payment System

- stripe

---

---

# II. Setup

Required keys and certificates have been intentionally stripped from the application and so you will need to provide your own. This can be achieved through creating Stripe and Okta developer accounts. Otherwise the configuration files are left intact to help serve as a template. Notations for these requirements will be made in the code.

---

---

# III. Layout and Descriptions

## Frontend

The frontend of this application was built in VSCodium as an Angular project and utilizes node.js in building our server connection. Boot strap is utilized in table stylizing.

Adjustments have been made in angular.json, package.json, and tsconfig.json.

In addition to standard angular files and folders note ssl-localhost,
please see the following https://github.com/darbyluv2code/fullstack-angular-and-springboot/blob/master/bonus-content/secure-https-communication/openssl-setup.md in order to generate.

### src Package and File Layout:

| Package/File          | Description                                                                                                                                             |
| --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| package: app          | Contains the majority of packages and files critical to the application. Will expand on this package below.                                             |
| package: assets       | contains logo and product images                                                                                                                        |
| package: environments | contains our information for development, q&a, and production environments. Your publishable Stripe key will be needed for the development environment. |
| file: typings.d.ts    | Declares variables for use with Stripe.                                                                                                                 |
|                       |

### app Package and File Layout:

| Package/File        | Description                                                                                                   |
| ------------------- | ------------------------------------------------------------------------------------------------------------- |
| package: common     | Contains all our files for object constructors referenced on the frontend.                                    |
| package: components | Contains all packages and files to create components and enact their logic in the application.                |
| package: config     | Contains information for Okta oidc configuration. You will need to insert your values from Okta account here. |
| package: services   | Contains files linking logic from backend methods to frontend and handling logic for front end components. .  |
| package: validators | Contains means for custom validation of customer input.                                                       |
| file: app.module.ts | Defines our routes.                                                                                           |

---

---

## Backend

The backend of this application is comprised of a sql database built in MySql from the courses provided database scripts. The API is created utilizing Spring Boot and Lombok removes a bit of boiler-plate code. Backend Application was built in intellij as a maven and spring boot project. Postman was occasionally used in testing the API.

---

### Initial Layout:

| Package/File       | Description                                                                                                                                                                                                                                                 |
| ------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| package: java      | Holds the projects main code.                                                                                                                                                                                                                               |
| package: resources | Contains the project's key store and application properties files. These files hold values for use across the application in regards to ports, paths, authentication. This will be an area where you will need to spend some time entering your own values. |

---

### Java Package Layout:

| Package/File        | Description                                                                                                                                                                                                           |
| ------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| package: config     | Classes established here are used in limiting HTTP methods, handling cors, and protecting and exposing endpoints.                                                                                                     |
| package: controller | Provides mapping for the checkout service.                                                                                                                                                                            |
| package: dao        | Files in our Data Access Object package create endpoints for our api which provides data to be used in business logic.                                                                                                |
| package: dto        | Contains our Data Transfer Objects pertaining to purchases.                                                                                                                                                           |
| package: entity     | Files found in this package map our database for transfer to our front end displays of the data found there.                                                                                                          |
| package: service    | The checkout service found here handles our business logic in regards to creating a payment intent to send to Stripe for processing, generating a tracking number for the customer and providing a purchase response. |
| file: ecommerceapp  | Contains our main method and launches the application.                                                                                                                                                                |

---

---

# IV. Future Implementations

Next plans for the current application include AWS implementation for hosting the application and making it easily accessible.

---

---

# V. Video Demonstrations of Application

---

---
