package MicroC_language;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import MicroC_language.parsing.*;




public class MicroC {

	public static void main(String args[]) throws Exception {
//		if (args.length == 0) {
//			System.out.println("Error: No program specified.");
//			return;
//		}
        // MicroCLexer lex = new MicroCLexer(new ANTLRFileStream(args[0]));
        MicroCLexer lex = new MicroCLexer(new ANTLRFileStream("test/test1.microC"));
        System.out.println("Read file successful");
        CommonTokenStream tokens = new CommonTokenStream(lex);
        MicroCParser parser = new MicroCParser(tokens);
		parser.program(); //This command parses the program.
		System.out.println("Program terminated");
       
	}
}
