# Dev-Journal

These notes were made while working on this project and is intended as supplemental material alongside the README and videos in this repository.

### Thank You for Checking out what I am working on!

---

-4 Feb 2022-

Issue to with nev links not working tracked to product-category-menu-component.html. Issue Corrected.

Next will be finding why purchase button is not responding.
suspect the issue related to -> TypeError: this.checkoutService is undefined

Discrepancy in naming of method for validator and string entered as part of checkout component, with problems in the check out component meant the checkout service was failing.

issue resolved.

Corrected bug where refresh after checkout would repopulate cart with previous items purchased.

implemented sending receipt via email

having customer details show up in stripe dashboard
as well as a description.

Think we're about there. Thank you Chad and Hari!

---

-31 Jan 2022-

Possibly an issue with deprecated onPromise method resulting in an undefined error. Researching the issue.

---

-30 Jan 2022-

Was running into a bug after studies and implementation of front end implementation for Stripe. Error was in back end port number. Issue is now resolved.

---

-29 Jan 2022-

Began implementation of Stripe payment Services. Initial work on Backend complete.

---

-27 Jan 2022-

Application updated for https front and back.

---

-26 Jan 2022-

Orders endpoint secured from front and back.

---

-25 Jan 2022-

Development of backend to search for orders by email. Development of front end to display users orders by most recent. Pre-populate order form with users email once logged in.

---

-24 Jan 2022-

Okta security widget working as desired. Separate section for authenticated members created. Updated Backend Configurations to eliminate hard code. Updated allowable methods. Hopefully just about a week more!

---

-23 Jan 2022-
Alert box is now populating with order number and login button generates Okta sign in. However can not log in yet due to a cookie configuration.

---

-20 Jan 2022-

Was not receiving fully desired output after implementing front end of sending order information. Investigating backend revealed multiple changes
needed for correct population of DB. That appears to have been corrected but still researching why the alert box with order confirmation is not generating. update** html typo**

---

-19 Jan 2022-

Validation of form field input implemented and functioning.

Cart price total and quantity total at checkout now functioning as intended.

Implemented api receiving an order and writing to database and generating a tracking number that is also written to database.

---

-17 Jan 2022-

Country and State drop downs implemented. States dependent on country.
Began field input validation.

---

-16 Jan 2022-

Dependent fields implemented (expiration month and years).

---

-15 Jan 2022-

Began laying out checkout form components and building html.

---

-14 Jan 2022-

Cart details can now be viewed and altered.
Displays total quantity price and adds button for checkout.

---

-13 Jan 2022-

Items can be added to cart and sub-totaled from Main and Detail view.

---

-11 Jan 2022-

Pagination for results by category and results by keyword functioning

---

-10 Jan 2022-

Can now search products by keyword and message for if no results found

---

-9 Jan 2022-

Links now appropriately return items based on category id

category menu now loads dynamically based on contents of db

---

-7 Jan 2022-

Front and Backend are connected and some modifications for style. Currently working on queries by category id.

---
