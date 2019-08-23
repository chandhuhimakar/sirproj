Feature: Casestudy on TestMe App
@Smoke
  Scenario Outline: Register to TestMe App
    Given testMe App is launched
    Then  click on the  SignUp link
    Then enter username  "<usern>"
    Then enter firstname  "<fname>"
    Then enter lastname  "<lname>"
    Then enter password  "<passw>"
    Then enter confirmpassword  "<cpassw>"
    Then enter Gender
    Then enter email  "<email>"
    Then enter mobilenumber  "<mobilenumber >"
    Then enter dob  "<dob>"
    Then enter address  "<address>"
    Then  enter the securityquestion 
    Then  enter answer  "<answer>"
    And   click on the  Register button
    Then  verify registration status

    Examples: 
      | usern   			| fname   | lname | passw  | cpassw | email                  | mobilenumber | dob        | address      | answer     |
      | spacetoearth  | rame    | nath  | asd123 | asd123 | ravin85@gmail.com  | 1234567890   | 02/05/1984 | delhi  | gujarat    |


@Sanity
  Scenario: Login to TestMe App
    Given  user enters valid username in login page 
    And    user enters corresponding password 
    And    click on login button
    Then  verifie login status
 
@Sanity
  Scenario: Search for a product
    Given  Search for  a product in search field
    Then   click on  finddetails
    Then   Add to  cart
    Then   User  proceeds to payment
    Then   Continue  the payment process
    
@Sanity
  Scenario: The one where user moves to cart with out adding any item in it
    Given   Alex  logins to TestMeApp
    When   Alex  search a product like headphone
    And    Try to  proceed for payment without adding any item to the cart
    Then    TestMe  does not show the cart icon
