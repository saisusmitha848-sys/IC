class WebsiteValidator {
    String url;

    public static void main(String[] args) {

     
        WebsiteValidator w1 = new WebsiteValidator();
        w1.url = "https://www.google.com";

        if (w1.url.startsWith("https://")) {
            System.out.println("Secure Website URL");
        } else {
            System.out.println("Invalid Website Protocol");
        }

       
        WebsiteValidator w2 = new WebsiteValidator();
        w2.url = "http://www.google.com";

        if (w2.url.startsWith("https://")) {
            System.out.println("Secure Website URL");
        } else {
            System.out.println("Invalid Website Protocol");
        }
    }
}
