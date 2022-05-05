package com.github.atgomes.ibangenerator;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import picocli.CommandLine;

import java.util.concurrent.Callable;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.Parameters;

@Command(name = "checksum", mixinStandardHelpOptions = true, version = "checksum 4.0",
        description = "Prints the checksum (SHA-256 by default) of a file to STDOUT.")
public class IbanGeneratorCommand implements Callable<Integer> {

    @Parameters(index = "0", description = "Country code for the IBAN")
    private String countryISO2Code;


    @Override
    public Integer call() {
        System.out.println(Iban.random(CountryCode.getByCode(countryISO2Code)));
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new IbanGeneratorCommand()).execute(args);
        System.exit(exitCode);
    }
}
