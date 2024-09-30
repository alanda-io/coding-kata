package gg.jte.generated.ondemand;
public final class JteexampleResultGenerated {
	public static final String JTE_NAME = "exampleResult.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,11,11,11,11,12,12,12,15};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteexampleResultGenerated.class, "JteexampleResultGenerated.bin", 237,33,30);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, io.alanda.codingkata.model.ExampleData exampleData) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		jteOutput.setContext("strong", null);
		jteOutput.writeUserContent(exampleData.text());
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
		jteOutput.setContext("strong", null);
		jteOutput.writeUserContent(exampleData.number());
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		io.alanda.codingkata.model.ExampleData exampleData = (io.alanda.codingkata.model.ExampleData)params.get("exampleData");
		render(jteOutput, jteHtmlInterceptor, exampleData);
	}
}
