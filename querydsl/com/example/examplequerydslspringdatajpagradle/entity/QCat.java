package com.example.examplequerydslspringdatajpagradle.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCat is a Querydsl query type for Cat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCat extends EntityPathBase<Cat> {

    private static final long serialVersionUID = -2060680356L;

    public static final QCat cat = new QCat("cat");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QCat(String variable) {
        super(Cat.class, forVariable(variable));
    }

    public QCat(Path<? extends Cat> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCat(PathMetadata metadata) {
        super(Cat.class, metadata);
    }

}

