package org.adligo.i.threads;

/**
 * This interface contains adaptor methods for basic threading used by JSE 
 * that are also in use by JME / CLDC / MEEP / MIDP. <br/><br/>
 * Like all of Adligp's Context (abbreviated Ctx) facilitate ths Stubbing Pattern with tools like;
 * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}<br/><br/>
 *   However it is missing many JSE features like Executors and ThreadPools
 *  that are available in I_ThreadJseCtx in the i_threads4jse.adligo.org project.  
 *  For that functionality look at;
 *  {@link <a href="https://github.com/adligo/i_threads4jse.adligo.org">i_threads4jse.adligo.org</a>}<br/><br/>
 *  
 * @author scott<br/><br/>
 *
 * <pre><code>
 *  ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code></pre>
 */
public interface I_ThreadCtx {

  /**
   * This allows stubbing of a synchronized block, so that you can assert 
   * that the synhcronized block occured and also 
   * @param o
   * @param r
   */
  default void synchronize(Object o, Runnable r) {
    synchronized (o) {
      r.run();
    }
  }

  /**
   * This toggles the Threads interrupt, it provides the ability
   * to assert if it has been called by mockito_ext.adligo.org.
   * https://www.baeldung.com/java-thread-stop
   */
  default void toggleInterruptFlag() {
    Thread.currentThread().interrupt();
  }
  
}
