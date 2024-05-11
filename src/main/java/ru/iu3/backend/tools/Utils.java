
package ru.iu3.backend.tools;

import org.springframework.security.crypto.codec.Hex;
import java.security.MessageDigest;
import ru.iu3.backend.models.Country;
import org.springframework.security.crypto.codec.Hex;
import java.security.MessageDigest;
import java.util.Optional;
import ru.iu3.backend.models.Artist;
import ru.iu3.backend.models.Museum;
import ru.iu3.backend.controllers.ArtistController;
import ru.iu3.backend.controllers.MuseumController;
import ru.iu3.backend.repositories.MuseumRepository;
import ru.iu3.backend.repositories.ArtistRepository;
public class Utils {

    public static String ComputeHash(String pwd, String salt)
    {
        MessageDigest digest;
        byte[] w = Hex.decode(new String(Hex.encode(pwd.getBytes())) + salt);
        try {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch (Exception ex) {
            return new String();
        }
        return new String(Hex.encode(digest.digest(w)));
    }
}
