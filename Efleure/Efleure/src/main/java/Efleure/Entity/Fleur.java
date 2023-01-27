package Efleure.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fleur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFleur;
    private String nomFleur;
    private String Description ;
}
