import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MyClient {
    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        Client client = ClientBuilder.newBuilder().withConfig(clientConfig).build();

        WebTarget resouce = client.target("https://na1.api.riotgames.com/lol/summoner/v4/summoners/by-name/mrswagbagtag");
        Response response = resouce.request(MediaType.APPLICATION_JSON).get();

        String ret = response.readEntity(String.class);
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed HTTP error code: " + response.getStatus() + ", " + ret);

        }
        System.out.println(ret);
    }
}
