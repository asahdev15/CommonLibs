package asahdev.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class NumbersModel {
    private int firstNumber;
    private int secondNumber;
}