package asahdev.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	private Address address;
	private String[] languages;

}

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
class Address {

	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;

}