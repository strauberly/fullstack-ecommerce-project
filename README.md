
# README #

This repository is a display of my work on a project as an assignment from Chad Darby of http://www.luv2code.com. The assignment is building an e-commerce application utilizing Angular for the  frontend and SpringBoot for the back and utilizes resources provided by Chad (css, html, graphics, starter code, sql scripts). Thank you Chad!

This repository will be updated ittermittently with notes and progress updates.

All starter files and code provided by Chad Darby.

Future implementation: I intend to use what is learned here as a means to create my own Angular application to add to my project portfolio for consideration by employers.

#Thank You for Checking out what I am working on!
--------------------------
-4 Feb 2022-

Issue to with nev links not working tracked to product-category-menu-component.html. Issue Corrected.

Next will be finding why purchase button is not responding.
suspect the issue related to -> TypeError: this.checkoutService is undefined

--------------------
-31 Jan 2022-

Possibly an issue with deprecated onPromise method resulting in an undefined error. Researching the issue.
--------------------
-30 Jan 2022-

Was running into a bug after studies and implementation of front end implementation for Stripe. Error was in back end port number. Issue is now resolved.
--------------------

-29 Jan 2022-

Began implementation of Stripe payment Services. Initial work on Backend complete.
--------------------
-27 Jan 2022-

Application updated for https front and back.
--------------------
-26 Jan 2022-
Orders endpoint secured from front and back.
--------------------
-25 Jan 2022-
Development of backend to search for orders by email. Development of front end to display users orders by most recent. Pre-populate order form with users email once logged in.
--------------------
-24 Jan 2022-
Okta security widget working as desired. Seperate section for authenticated members created. Updated Backend Configurations to eliminate hard code. Updated allowable methods. Hopefully just about a week more!
--------------------
-23 Jan 2022-
Alert box is now populating with order number and login button generates Okta sign in. However can not log in yet due to a cookie configuration.
--------------------------
-20 Jan 2022-
Was not receiving fully desired output after implenting front end of sending order information. Investigating backend revealed multiple changes nedded for correct population of DB. That appears to have been corrected but still researching why the alert box with order confirmation is not generating. update** html typo**
--------------------------
-19 Jan 2022-
Validation of form field input implemented and functioning.

Cart price total and quantity total at checkout now functioning as intended.

Implented api receiving an order and writing to database and generating a tracking number that is also written to database.
--------------------------

-17 Jan 2022-
Country and State drop downs implemented. States dependent on country.
Began field input validation.
--------------------------

-16 Jan 2022-
Dependent fields implemented (expiration month and years).
--------------------------

-15 Jan 2022-
Began laying out checkout form components and building html.
--------------------------

-14 Jan 2022-
Cart details can now be viewed and altered.
Displays total quantity price and adds button for checkout.
--------------------------


-13 Jan 2022-
Items can be added to cart and sub-totaled from Main and Detail view. 

--------------------------
-11 Jan 2022-
Pagination for results by category and results by keyword functioning 

------------------------------------------
-10 Jan 2022-
Can now search products by keyword and message for if no results found


----------------------
-9 Jan 2022-

Links now appropriatly return items based on category id

category menu now loads dynamically based on contents of db


---------------
-7 Jan 2022-

Front and Backend are connected and some modifications for style. Currently working on queries by category id.


