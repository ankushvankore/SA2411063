Feature: Registration process

  Background: 
    Given Launch registration page

  Scenario: To validate Registration process with multiple data set
    When I pass the data as follows
      | Pavan  | S     | pavan@gmail.com  | Male   | 9898989898 |
      | Trupti | Pawar | trupti@gmail.com | Female | 8787878787 |
    Then Registration success

  Scenario: To validata Registration process via map
    When I Enter the data as follows
      | FirstName | LastName | EmailId           | Gender | MobileNo   |
      | Supriya   | SV       | supriya@gmail.com | Female | 7878787878 |
      | Anusha    | Kavali   | anusha@gmail.com  | Female | 8989898989 |
    Then Registration will successful
