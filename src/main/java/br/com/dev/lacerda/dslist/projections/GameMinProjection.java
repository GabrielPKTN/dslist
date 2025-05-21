package br.com.dev.lacerda.dslist.projections;

public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	int getYear();
	String getImgUrl();
	String getShortDescription();
	int getPosition();
}
