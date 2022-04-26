package ca.uqtr.inf1013_h22_g5.services;

import com.flickr4java.flickr.FlickrException;

import java.io.InputStream;

public interface FlickrService {

    String savePhoto(InputStream photo, String title) throws FlickrException;
}
