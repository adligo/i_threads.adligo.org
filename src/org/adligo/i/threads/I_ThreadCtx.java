package org.adligo.i.threads;

/**
 * This interface contains adaptor methods for basic threading used by JSE 
 * that are also in use by JME / CLDC / MEEP / MIDP.
 *   However it is missing many JSE features like Executors and ThreadPools
 *  that are available in I_ThreadJseCtx in the i_threads4jse.adligo.org project.
 *    Like all of Adligo's Ctx (Context) classes this provides a way to 
 * stub out the creation of various methods using mockito_ext.adligo.org.
 *  
 * @author scott
 *
 * 
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
 */
public interface I_ThreadCtx {

  /**
   * This will eventually return new VirtualThreads when Project Loom's
   * Virtual Thread are promoted from pre-release to actually released;
   * 
   * https://www.youtube.com/watch?v=EO9oMiL1fFo
   * No more thread Pools ? async await is 'thread like' but not a real thread
   * https://download.java.net/java/early_access/loom/docs/api/java.base/java/util/concurrent/Executors.html#newVirtualThreadPerTaskExecutor()
   * Throughput optimization formula 
   * 
   * Brian Gotez 'Reactive Coding is dead'
   * records are a surrogate for Tuples
   * https://www.youtube.com/watch?v=9si7gK94gLo
   * 
   * @return either a good old fashioned Java Thread or a Virtual Thread
   */
  public Thread newThread();

  /**
   * This toggles the Threads interrupt, it provides the ability
   * to assert if it has been called by mockito_ext.adligo.org.
   * https://www.baeldung.com/java-thread-stop
   */
  public void toggleInterruptFlag();
}
