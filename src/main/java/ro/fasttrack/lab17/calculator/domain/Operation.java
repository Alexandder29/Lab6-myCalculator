package ro.fasttrack.lab17.calculator.domain;

public record Operation (
        long id,
        Integer op1,
        String op,
        Integer op2,
        double result
) {}
