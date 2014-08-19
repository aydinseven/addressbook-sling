    Address Book Web Application with Apache Sling

This is a small web application build using with Apache Sling, JCR and ESP (ECMAScript).

Before running the Sling Address Book, the following requirements must be met:

    - Maven 3 must be installed
    - GIT must be installed
    - A Sling instance must be installed and running
    

To run the Sling Address Book, follow these steps:

    1. git clone git@github.com:aydinseven/addressbook-sling.git to checkout the project
    2. cd addressbook-sling
    3. mvn clean install -PautoInstallBundle
    4. Open the browser at http://localhost:8080/content/addressbook/contacts.html
