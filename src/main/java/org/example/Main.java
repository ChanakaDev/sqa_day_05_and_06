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
//      - EbayHome (for web elements and their behaviour, in Home page)
//      - EbayPhonesResultsPage (for web elements and their behaviour, in PhonesResult page)
//      - EbayShoesResultsPage (for web elements and their behaviour, in ShoesResult page)

// 5. create test classes (for test cases)
//      - EbayMobilePhonesTests (test methods for mobile phones)
//      - EbayShoesTests (test methods for shoes)

// 6. create utility classes (for supporting the pom model)
//      - BrowserFactory (Methods for initializing the browserFactory)
//      - TestNGUtil (init and quite browserFactory (aka the browser instance))


// Steps according to the order of execution
// =========================================
// 1. ✅ correct Implement the BrowserFactor Class
// 2. ✅ Implement the TestNGUtil Class
// 3. ✅ Implement the PageBase Class
// 4. Implement the EbayHome class
// 5. Implement the TestCases

// Important classes
// =================
// *. BrowserFactory => is used to create web browser instances
// *. PageFactory => is used to create web page instances