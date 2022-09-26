package com.example.dependencyinversion;

public class Main {

    public static void main(String[] args) {
        MessageProducer messageProducer = new ConsoleMessageProducer();
        MessagePrinter firstMessagePrinter = new MessagePrinter(messageProducer);
        firstMessagePrinter.printMessage();
    }

}
