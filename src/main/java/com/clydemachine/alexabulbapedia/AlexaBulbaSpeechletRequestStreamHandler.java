package com.clydemachine.alexabulbapedia;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import com.clydemachine.alexabulbapedia.AlexaBulbaSpeechlet;

import java.util.HashSet;
import java.util.Set;

public class AlexaBulbaSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> appIds = new HashSet<String>();
    static {
        //Add new Application IDs that should be allowed to use this skill with: appIds.add("");
        appIds.add("");
    }

  public AlexaBulbaSpeechletRequestStreamHandler() {
      super( new AlexaBulbaSpeechlet(), appIds );
  }
}
