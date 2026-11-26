import java.util.LinkedList;

public class BrowserHistoryManagement {

    public static void main(String[] args) {

        
        LinkedList<String> history = new LinkedList<>();

       
        history.add("https://www.google.com");
        history.add("https://www.youtube.com");
        history.add("https://www.facebook.com");
        history.add("https://www.instagram.com");
        history.add("https://www.github.com");

       
        history.add("https://www.wikipedia.org");

     
        System.out.println("Browsing History:");

        for (String website : history) {
            System.out.println(website);
        }

        
        if (!history.isEmpty()) {
            String removedWebsite = history.removeLast();

            System.out.println("\nRemoved Recently Visited Website:");
            System.out.println(removedWebsite);
        }

        
        if (!history.isEmpty()) {
            System.out.println("\nFirst Visited Website: " + history.getFirst());
            System.out.println("Last Visited Website: " + history.getLast());
        }

        
        String searchWebsite = "https://www.youtube.com";

        if (history.contains(searchWebsite)) {
            System.out.println("\n" + searchWebsite + " was visited.");
        } else {
            System.out.println("\n" + searchWebsite + " was not visited.");
        }

       
        System.out.println("\nUpdated Browsing History:");
        System.out.println(history);

       
        history.clear();

        System.out.println("\nBrowsing history cleared.");

        
        System.out.println("Total Websites in History: " + history.size());
    }
}
