package com.tom.example.testing123;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Main32 {

  private static final String II360_CONFIG_SERVICE_URL =
      "https://nexus.devl-int.ii.co.uk/nexus/service/local/repositories/snapshots/content/uk/co/ii/service/ii360-config-service/0.0.1-SNAPSHOT/ii360-config-service-0.0.1-20240531.131520-28-stubs.jar";

  private static ObjectMapper objectMapper = new ObjectMapper();

  public static void main(String[] args) {
    byte[] nexusResponse = getNexusResponse();
    JarFile jarFile = new JarFile(File.(nexusResponse));

    try (JarInputStream jarStream = new JarInputStream(new ByteArrayInputStream(nexusResponse))) {
      JarEntry jarEntry;
      while ((jarEntry = jarStream.getNextJarEntry()) != null) {
        System.out.println(jarEntry.getName());
        if (jarEntry.getName().endsWith(".json")) {
          jarStream.
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static byte[] getNexusResponse() {
    try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
      HttpGet httpGet = new HttpGet(II360_CONFIG_SERVICE_URL);
      var response = httpClient.execute(httpGet);
      try (InputStream responseInputStream = response.getEntity().getContent()) {
        return responseInputStream.readAllBytes();
      }
    } catch (IOException e) {
      throw new RuntimeException("Failed to get jar file", e);
    }
  }


}