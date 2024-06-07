package AimsProject.hust.soict.dsai.aims.media;

import AimsProject.hust.soict.dsai.aims.exception.PlayerException;

public interface Playable {
    public StringBuffer play() throws PlayerException;
}
