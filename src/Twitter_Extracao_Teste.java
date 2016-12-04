import twitter4j.Twitter.*;
import twitter4j.*;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class Twitter_Extracao_Teste{

public static void main(String[] args) throws TwitterException {

    ConfigurationBuilder cb=new ConfigurationBuilder();
    cb.setDaemonEnabled(true)
    .setOAuthConsumerKey("d8T6FlwUxGRcLQnsLgEJ1YMdn")
    .setOAuthConsumerSecret("ydcs7JW1gERrgk2bE4OhYLZPNm2VteOQkQogUp4VzPKcLiA8pG")
    .setOAuthAccessToken("743868686155583489-gl8MXXeXARGvPz7SdeSTDMhduCnyO0U")
    .setOAuthAccessTokenSecret("JOllSaq3b6DvJ68vTWiq9GM2boX7MfNrRl7SC85vWkv1r");

    TwitterFactory tf=new TwitterFactory(cb.build());
    Twitter twitter=tf.getInstance();

    Query query=new Query("trump");
    QueryResult result=twitter.search(query);
    for (Status status:result.getTweets()){
        System.out.println("@"+status.getUser().getScreenName()+":"+status.getText()+status.getRetweetCount());
    }

        }


}