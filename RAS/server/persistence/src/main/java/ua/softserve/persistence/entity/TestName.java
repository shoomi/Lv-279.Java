package ua.softserve.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "testes_names")
public class TestName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long testId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "academy_id")
    private Academy groupId;

    @NotNull
    @Column(name = "test_name")
    private String testName;

    @NotNull
    @Column(name = "test_max_score")
    private Double testMaxScore;

    @Column(name = "test_sequence")
    private Integer testSequenceNum;

    @Transient
    private boolean removed;

    public TestName() {
        this.removed = false;
    }

    public TestName(Academy group_id, String testName, Double testMaxScore) {
        this.groupId = group_id;
        this.testName = testName;
        this.testMaxScore = testMaxScore;
        this.removed = false;
    }
}
