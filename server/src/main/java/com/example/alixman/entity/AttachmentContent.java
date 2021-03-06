package com.example.alixman.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import com.example.alixman.entity.template.AbsEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AttachmentContent extends AbsEntity {

    @OneToOne(optional = false)
    private Attachment attachment;
    @Column(nullable = false)
    private byte[] content;

}
