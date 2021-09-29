package org.self.enums.state;

// For a basic sanity check:
public class RandomInputGenerator implements Generator<Input> {

	@Override
	public Input next() {
		return Input.randInput();
	}

}
