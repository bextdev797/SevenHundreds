package com.brandonang.sevenhundreds;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.EventDispatcher;

public class SevenHundreds extends AndroidNonvisibleComponent {

  public SevenHundreds(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "Multiply 7 by a Hundred.")
  public void MultiplySevenbyHundred(double hundred) {
    int factor2 = 7;

    if(hundred < 1000){
     double multiplication = hundred * 7;
     MultipliedSevenbyHundred(multiplication);
    } else {
     throw new YailRuntimeError("MultiplySevenbyHundred", "Greater Than 1000 can't be");
    }
  }

    @SimpleEvent(description = "Get result")
    public void MultipliedSevenbyHundred(double multiplication){
      EventDispatcher.dispatchEvent(this, "MultipliedSevenbyHundred", multiplication);
    }
  }