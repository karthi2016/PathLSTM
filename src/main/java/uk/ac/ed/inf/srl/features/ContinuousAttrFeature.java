package uk.ac.ed.inf.srl.features;

import se.lth.cs.srl.corpus.Word.WordData;
import se.lth.cs.srl.features.ContinuousFeature;
import se.lth.cs.srl.features.FeatureName;
import se.lth.cs.srl.features.TargetWord;
import se.lth.cs.srl.features.WordExtractor;

public abstract class ContinuousAttrFeature extends ContinuousFeature {
	private static final long serialVersionUID = 1;

	protected WordData attr;
	protected WordExtractor wordExtractor;

	protected ContinuousAttrFeature(FeatureName name, WordData attr,
			TargetWord tw, boolean includeArgs,
			boolean usedForPredicateIdentification, String POSPrefix) {
		super(name, includeArgs, usedForPredicateIdentification, POSPrefix);
		this.attr = attr;
		this.wordExtractor = WordExtractor.getExtractor(tw);
	}

}
