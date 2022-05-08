package com.github.atgomes.ibangenerator;

import picocli.CommandLine;

import java.io.InputStream;
import java.util.Properties;

/**
 * Simple version provider that reads the app version from a properties file.
 */
public class PropertyFileVersionProvider implements CommandLine.IVersionProvider {

    @Override
    public String[] getVersion() throws Exception {

        try (InputStream input = PropertyFileVersionProvider.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties prop = new Properties();

            if (input != null) {
                prop.load(input);

                return new String[]{prop.getProperty("version")};
            }
        }

        return new String[0];
    }
}
