package programs.praticals;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ObfuscatedId {
  private static Map<String, Integer> idMap = new HashMap<>();
  private static int nextId = 1;

  public static String getObfuscatedId(int id) {
    // Check if the ID has already been obfuscated
    for (Map.Entry<String, Integer> entry : idMap.entrySet()) {
      if (entry.getValue() == id) {
        System.out.println("");
        return entry.getKey();
      }
    }

    // If not, generate a new obfuscated ID
    String obfuscatedId;
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hash = digest.digest(String.valueOf(id).getBytes());
      obfuscatedId = Base64.getEncoder().encodeToString(hash).substring(0, 8);
    } catch (NoSuchAlgorithmException e) {
      // Handle error
      return null;
    }

    // Add the ID and obfuscated ID to the map
    idMap.put(obfuscatedId, id);
    return obfuscatedId;
  }

  public static int getId(String obfuscatedId) {
    return idMap.get(obfuscatedId);
  }

  public static void main(String[] args) {
    String id = getObfuscatedId(121);
    System.out.println("Encrypted : " + id);
    System.out.println("Decrypted : " + getId(id));
  }
}
