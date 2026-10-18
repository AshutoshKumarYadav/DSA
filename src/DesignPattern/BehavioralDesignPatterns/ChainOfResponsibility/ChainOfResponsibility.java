package DesignPattern.BehavioralDesignPatterns.ChainOfResponsibility;


/*जब कोई request आती है और उसे process करने के लिए एक के बाद एक कई handlers हो सकते हैं, तो request को एक chain में भेजते हैं।
जो handler request को handle कर सकता है, वह उसे handle करता है; नहीं तो अगले handler को भेज देता है।*/

public class ChainOfResponsibility {
    public static void main(String[] args){
        Approver manager = new Manager();
        Approver seniorManager = new SeniorManager();
        Approver director = new Director();

        manager.setNextApprover(seniorManager);
        seniorManager.setNextApprover(director);
        manager.approve(5000);
    }
}
