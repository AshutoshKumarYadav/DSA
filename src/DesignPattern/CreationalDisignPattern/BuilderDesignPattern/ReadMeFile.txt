Problem क्या है?

मान लीजिए हमारे पास Employee class है:

Employee employee = new Employee(
        "Ashutosh",
        35,
        "Java",
        "Hyderabad",
        "HCL",
        100000,
        "Male"
);

यहाँ problem है:

बहुत सारे parameters हैं।
Parameter का order याद रखना पड़ता है।
कौन-सा parameter optional है, पता लगाना मुश्किल है।
Constructor बहुत बड़ा हो सकता है।
अगर 10–15 fields हों तो code unreadable हो जाता है।

इसे Telescoping Constructor Problem कहते हैं।

2. Builder Pattern का solution

Builder हमें ऐसा code लिखने देता है:

Employee employee = new Employee.Builder()
        .name("Ashutosh")
        .age(35)
        .technology("Java")
        .city("Hyderabad")
        .company("HCL")
        .salary(100000)
        .build();

यह ज्यादा readable है।

आप clearly देख सकते हैं:

name → Ashutosh
age → 35
technology → Java
city → Hyderabad
company → HCL
salary → 100000
3. Complete Java Example
package JPMorgan;
