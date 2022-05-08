# IBAN Generator CLI tool

Very simple app that wraps [Iban4j](https://github.com/arturmkrtchyan/iban4j)'s IBAN generation in a Picocli CLI.

This project started as a simple utility to accelerate manual testing of a payment application I worked on, but once I
received the feedback that this could be useful for other aspects of our job at the time, I decided to polish it up and 
publish it to serve as reference and template for other simple, single purpose, CLI tools.

## Prerequisites

- [Java](https://java.com/en/download/manual.jsp)  - a JRE installation is required for the generated scripts to work

## Building

```bash
.\mvnw clean package
```

The application distributables will be generated at `target/distributions/app/`.

## Installing

Extract the zip archive to the desired location.

To not have to always specify the full path of the script, add the location of the `.sh` / `.bat` files to the `PATH` environment variable.

## Usage

Generate a German IBAN:

```bash
ibangen DE
```
