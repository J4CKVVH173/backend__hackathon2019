package ru.digital.hack.parent.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reviews")
public class ReviewsEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long reviewId;

    @Column(name = "website" )
    private String website;

    @Column(name = "company_name" )
    private String company_name;

    @Column(name = "review_text")
    private String review_text;

    @Column(name = "review_rating")
    private String review_rating;

    @Column(name = "review_time" )
    private String review_time;

    @Column(name = "company_type_single_big" )
    private String company_type_single_big;

    @Column(name = "status" )
    private String status;

    @Column(name = "status_text")
    private String status_text;

    @Column(name = "address")
    private String address;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lng")
    private String lng;

    @Column(name = "inn")
    private String inn;

    @Column(name = "okved")
    private String okved;

    @Column(name = "okpo" )
    private String okpo;

    @Column(name = "opf")
    private String opf;

    }
