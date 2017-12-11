package assignment1;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.core.KeywordAnalyzer;
import org.apache.lucene.analysis.core.SimpleAnalyzer;
import org.apache.lucene.analysis.core.StopAnalyzer;

public class indexComparison {

	public static void main(String[] args) {
//		Analyzer analyzer = new ShingleAnalyzerWrapper();
//		createAndPrint(analyzer, "Shingle Analyzer");
		Analyzer analyzer = new KeywordAnalyzer();
		createAndPrint(analyzer, "KeyWord Analyzer Results");
		analyzer = new SimpleAnalyzer();
		createAndPrint(analyzer, "Simple Analyzer Results ");
		analyzer = new StopAnalyzer();
		createAndPrint(analyzer, "Stop Analyzer Results");
		analyzer = new StandardAnalyzer();
		createAndPrint(analyzer, "Standard Analyzer Results");		
	}

	public static void createAndPrint(Analyzer analyzer, String type) {
		generateIndex g = new generateIndex();
		g.createIndex(analyzer, type);
		g.printResults();
	}
}
