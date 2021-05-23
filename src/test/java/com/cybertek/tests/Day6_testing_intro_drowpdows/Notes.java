package com.cybertek.tests.Day6_testing_intro_drowpdows;

public class Notes {
    /*
    #1- REVIEW
#2- PRACTICES
#3- TESTNG
#4- DROPDOWNS

------------------------------------------------------------------------------------

- XPATH:
    - What is xpath?
    - Xpath is one of the 8 locators in Selenium
    - Xpath allows us to create custom locators using any given attribute and value.
    - Xpath can move from parent to child, and child to parent.


    - How do we move from parent to DIRECT child?
    - To move from parent to direct child we use "/" at the end of the locator.

    Syntax: //tagName[@attribute='value']/childTag

    - How do we move from child to parent?
    - To move from child to direct parent we use "/.." at the end of the locator.

    Syntax: //tagName[@attribute='value']/..

    - How do we move from parent to ANY CHILD?
    - To move from parent to ANY child we use "//" at the end of the locator.

    Syntax: //tagName[@attribute='value']//anyChildTag --> This will jump to any given child tag under the already located web element

P.I.Q: How many different types of XPATH are there and what are the differences?
    - 2 types of xpath locators.

    #1- Absolute xpath:
        - Starts with "/"
        - It means it starts from the root element "html"
        - We have to move from parent to child until we reach desired web element
        - Therefore it is LONG and not dependable.
        - If one of the web elements used in this locator is removed, or any other web element is added, this locator will break.
        - Therefore absolute xpath is not suggested to use.

        syntax: /html/body/div/div/a


    #2- Relative xpath:
        - Starts with "//"
        - "//" means start from anywhere in the html.
                - means jump to the point you will be given
        - Relative xpath is a lot more reliable compared to absolute xpath.
        - For relative xpath to break, the web element (or the attribute value) we locate directly has to change.


        //tagName[@attribute='value']


    Common xpath locators:

    #1- //tagName[@attribute='value']
    #2- //tagName[.='text']
        //tagName[text()='text']

    #3- //tagName[contains(@attribute,'value')]
    #4- //tagName[starts-with(@attribute,'value')]
    #5- //tagName[ends-with(@attribute,'value')]

P.I.Q:
    - How do you handle dynamic web elements?
    - How do you handle web elements that has dynamic attribute value?

    <div id="sunny983745983475">

        <a href="https://www.google.com"> GOOGLE </a>

    </div>

    #3- //div[contains(@id,'sunny')]
    #4- //div[starts-with(@id,'sunny')]

    id="983745983475sunny"

    #5- //div[ends-with(@id,'sunny')]
Collapse
message.txt
3 KB
gurhan — Today at 11:14 AM
day6_testng_intro_dropdowns
all notes so far
MAY 23RD, SUNDAY

#1- REVIEW
#2- PRACTICES
#3- TESTNG
#4- DROPDOWNS

------------------------------------------------------------------------------------

- XPATH:
    - What is xpath?
    - Xpath is one of the 8 locators in Selenium
    - Xpath allows us to create custom locators using any given attribute and value.
    - Xpath can move from parent to child, and child to parent.


    - How do we move from parent to DIRECT child?
    - To move from parent to direct child we use "/" at the end of the locator.

    Syntax: //tagName[@attribute='value']/childTag

    - How do we move from child to parent?
    - To move from child to direct parent we use "/.." at the end of the locator.

    Syntax: //tagName[@attribute='value']/..

    - How do we move from parent to ANY CHILD?
    - To move from parent to ANY child we use "//" at the end of the locator.

    Syntax: //tagName[@attribute='value']//anyChildTag --> This will jump to any given child tag under the already located web element

P.I.Q: How many different types of XPATH are there and what are the differences?
    - 2 types of xpath locators.

    #1- Absolute xpath:
        - Starts with "/"
        - It means it starts from the root element "html"
        - We have to move from parent to child until we reach desired web element
        - Therefore it is LONG and not dependable.
        - If one of the web elements used in this locator is removed, or any other web element is added, this locator will break.
        - Therefore absolute xpath is not suggested to use.

        syntax: /html/body/div/div/a


    #2- Relative xpath:
        - Starts with "//"
        - "//" means start from anywhere in the html.
                - means jump to the point you will be given
        - Relative xpath is a lot more reliable compared to absolute xpath.
        - For relative xpath to break, the web element (or the attribute value) we locate directly has to change.


        //tagName[@attribute='value']


    Common xpath locators:

    #1- //tagName[@attribute='value']
    #2- //tagName[.='text']
        //tagName[text()='text']

    #3- //tagName[contains(@attribute,'value')]
    #4- //tagName[starts-with(@attribute,'value')]
    #5- //tagName[ends-with(@attribute,'value')]

P.I.Q:
    - How do you handle dynamic web elements?
    - How do you handle web elements that has dynamic attribute value?


    #1-> We use methods provided by xpath locator.
        - contains
        - starts-with
        - ends-with
    #2-> Find a static parent or child web element and move from that to desired web element.

    <div id="sunny983745983475">

        <a href="https://www.google.com"> GOOGLE </a>

    </div>

    #3- //div[contains(@id,'sunny')]
    #4- //div[starts-with(@id,'sunny')]

    id="983745983475sunny"

    #5- //div[ends-with(@id,'sunny')]


--> if you find dynamic attribute value, you can copy the value to notepad.
    - refresh the page, copy again.
    - compare to find static parts to be used.

            0ahUKEw iauP6g hODwAh WGX80KHYRaAUA Q39UDCAY
            0ahUKEw jNl5Ct hODwAh XXWc0KHetmDq8 Q39UDCAY


--> Using index numbers with xpath locator.
... (23 lines left)
     */
}
