package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;


import lombok.Data;

@Data
public class LinkRepresentation {
    private final String rel;
    private final String uri;
}
