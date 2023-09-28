public class ChatBotRunner {

    ChatBot debbie = new ChatBot("Debbie", 11);
    //debbie.greeting("Vincent");
    //debbie.weather();
    double meter = debbie.convertFeetToMeters(3);
    //debbie.favoriteNumber(10);
    int total = debbie.addNumbers(1, 2, 3);
    System.out.println(debbie.goodbye())


}
