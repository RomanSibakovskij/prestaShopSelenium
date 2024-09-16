#prestaShop Selenium e2e tests
Selenium tests on prestaShop demo page(vbox)

#Requirements
1.Java JDK 8 or higher
2.Apache Maven
3.IntelliJ IDEA (or another IDE that supports Java and Maven)
4. VirtualBox (for openCart demo image run)

#Setup
1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE
2. Install openCart demo image into VirtualBox (download link : "https://drive.google.com/drive/u/2/folders/12xObhACOOwflU5sZKScLMvKtSbSTZ84B")
3. Assert the image is up and running in the VBox, copy its URL (since it's a localized image, it's not static - with each re-install it changes)
4. Open the IDE and open the project folder
5. Navigate to the pom.xml file and install all required dependencies for the test run
6. Change the BaseTest url in driver.get() to the address provided in VBox run environment (or if you have copied the one beforehand)
7. Run the test via the IDE

#Tech used for these tests:
Virtual machine : VirtualBox
Programming language: Java
Framework: Selenium WebDriver
Automation tool for build-up of project dependencies / lifecycle: Maven
Testing framework: JUnit5 (Jupiter)
