package org.example;

public class Main {
    public static void main(String[] args) {
    }
}

// Steps of Implementing the Page Object Model (POM)
// =================================================
// 1. Add selenium, testng and web driver manager to the dependencies
// 2. Implement a basic traditional test case

// 3. Create the folder structure
//    pom
//      - pages
//      - tests
//      - utilities

// 4. create page classes (for page objects)
//      - PageBase (common methods for all the page objects (like get webpage, scroll it, hover it likewise)
//      - EbayHome (for web elements and their methods, in Home page)
//      - EbayPhonesResultsPage (for web elements and their methods, in PhonesResult page)
//      - EbayShoesResultsPage (for web elements and their methods, in ShoesResult page)

// 5. create test classes (for test cases)
//      - EbayHomeTests
//          (Test methods for the EbayHome page object)
//          (This class calls EbayHome page methods)

// 6. create utility classes (for supporting the pom model)
//      - BrowserFactory (Methods for initializing the browserFactory)
//      - TestNGUtil (init and quite browserFactory (aka the browser instance))


// Steps according to the order of execution
// =========================================
// 1. ✅ correct Implement the BrowserFactor Class
// 2. ✅ Implement the TestNGUtil Class
// 3. ✅ Implement the PageBase Class
// 4. ✅ Implement the EbayHome class
// 5. ✅ Implement the TestCases

// Important classes
// =================
// *. BrowserFactory => is used to create web browser instances
// *. PageFactory => is used to create web page instances
//
// *. PageBase class => inherit page objects
// *. TestNGUtil class => inherit test cases

// Enabling parallel processing to the pom
// =======================================
// 1. Install "create testng xml" plugin
// 2. Create testng.xml file
// 3. Auto format that file
// 4. If there is the test cases and methods, you don't need to manually add them
//    Otherwise you need to add them using the test, classes, class, methods, include tags
// 5. Set parallel="methods" and thread-count="#ofMethods"
// 6. Run th program using testng.xml file