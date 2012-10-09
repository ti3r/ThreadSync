/*
 * Copyright (c) 2012 Alexandro Blanco <ti3r.bubblenet@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software 
 * without restriction, including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software, and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE. 
 */
package org.blanco.test.thread;
/**
 * This class just prints its id to the System.out 
 * when it is run. It can be configured to wait for a period
 * of time before the run method exits.
 * 
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 *
 */
public class SimplePrintIdThread extends Thread {
	/** The id of the Thread */
	private long id = -1;
	/** The number of milliseconds to wait before end of run */
	private long sleep = -1;
	
	
	
	public SimplePrintIdThread(long id, long sleep) {
		super();
		this.id = id;
		this.sleep = sleep;
	}

	public SimplePrintIdThread(long id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Running Thread #:"+id);
		if (sleep > 0){
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
