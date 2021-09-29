package org.self;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

	public TryWithResources() {
	}

	/**
	 * 在单个资源上使用 try-finally 的方式来保证资源的关闭
	 * 
	 * @throws IOException 
	 */
	public void tryFinallyOnResources() throws IOException {
		FileReader reader = null;
		try {
			reader = new FileReader("");
		} finally {
			reader.close();
		}
	}

	/**
	 * 在多个资源上使用 try-finally 的方式来保证资源的关闭
	 * 
	 * @throws IOException 
	 */
	public void tryFinallyOnMultipleResources() throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter("");
			//
			FileReader reader = null;
			try {
				reader = new FileReader("");
			} finally {
				reader.close();
			}
		} finally {
			writer.close();
		}
	}

	/**
	 * 在单个资源上使用 try-with-resources 的方式来保证资源的关闭
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void TryWithResourcesOnResources() throws FileNotFoundException, IOException {
		try (FileReader reader = new FileReader("")) {

		}
	}

	/**
	 * 在单个资源上使用 try-with-resources 的方式来保证资源的关闭
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void TryWithResourcesOnMultipleResources() throws FileNotFoundException, IOException {
		try (FileReader reader = new FileReader(""); FileWriter writer = new FileWriter("")) {

		}
	}

}
