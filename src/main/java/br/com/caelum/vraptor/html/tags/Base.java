package br.com.caelum.vraptor.html.tags;

import br.com.caelum.vraptor.html.attributes.Attributes;

public class Base implements HeadTag{
	
	private static final NestedElement[] EMPTY = new NestedElement[0];
	private final Attributes attributes;
	private final TagTransformer tagTransformer = new DefaultTagTransformer();

	public Base(Attributes atrtibutes) {
		this.attributes = atrtibutes;
	}

	public NestedElement[] getChildren() {
		return EMPTY;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public String toHtml() {
		return tagTransformer.transform(this);
	}

}
