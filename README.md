    Address Book Web Application with Apache Sling

This is a small web application build using with Apache Sling, JCR and ESP (ECMAScript). It contains two sub-projects:

    - addressbook-sling-ui: Renders the user interface in the web browser
    - addressbook-sling-services: Contains services called by the user interface

Before running the Sling Address Book, the following requirements must be met:

    - Maven 3 must be installed
    - GIT must be installed
    - A Sling instance must be installed and running
    

To run the Sling Address Book, follow these steps:

    1. git clone git@github.com:aydinseven/addressbook-sling.git to checkout the project
    2. go into the addressbook-sling folder
    3. type "mvn clean install -PautoInstallBundle" in the shell to build the project
    4. Open the browser at http://localhost:8080/content/addressbook/contacts.html
