package ro.fasttrack.lab17.calculator.dataTransferObject;

public record OperationDTO(
        Integer op1,
        String op,
        Integer op2,
        double result
) {
}
