package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
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
//      - PageBase (for creating instances of the page objects)
//      - EbayHome (for web elements and their behaviour, in Home page)
//      - EbayPhonesResultsPage (for web elements and their behaviour, in PhonesResult page)
//      - EbayShoesResultsPage (for web elements and their behaviour, in ShoesResult page)

// 5. create test classes (for test cases)
//      - EbayMobilePhonesTests (test methods for mobile phones)
//      - EbayShoesTests (test methods for shoes)

// 6. create utility classes (for supporting the pom model)
//      - TestNGUtil (initialize browser factory)
//      - BrowserFactory (initialize browser instance)
