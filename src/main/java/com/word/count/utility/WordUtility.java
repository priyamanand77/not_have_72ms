package com.word.count.utility;

import java.util.List;
import java.util.Set;

public interface WordUtility {

    Set<String> EXCLUSION_WORDS = Set.copyOf(

            List.of(
                    "after", "before", "since", "than", "that", "though", "unless", "until", "when", "where", "while", "and", "but", "for", "or", "nor", "so", "yet", "both", "and", "either", "or", "neither", "nor", "not only", "but also",
                    "all", "another", "any", "anybody", "anyone", "anything", "aught", "both", "each", "each other", "either", "enough", "everybody", "everyone", "everything", "few", "he", "her", "hers", "herself", "him", "himself", "his", "I", "it", "itself", "many", "me", "mine", "most", "myself", "naught", "neither", "no one", "nobody", "none", "nothing", "nought", "one", "one another", "other", "others", "ought", "ours", "ourself", "ourselves", "several", "she", "some", "somebody", "someone", "something", "such", "suchlike", "that", "thee", "theirs", "theirself", "theirselves", "them", "themself", "themselves", "there", "these", "they", "thine", "this", "those", "thou", "thy", "thyself", "us", "we", "what", "whatever", "whatsoever", "whether", "which", "whichever", "whichsoever", "who", "whoever", "whom", "whomever", "whomso", "whomsoever", "whose", "whosever", "whosesoever", "whoso", "whosoever", "ye", "yon", "you", "yours", "yourself", "yourselves",
                    "about", "above", "across", "after", "against", "along", "among", "around", "as", "at", "before", "behind", "below", "beneath", "beside", "between", "beyond", "by", "concerning", "considering", "despite", "down", "during", "except", "excluding", "for", "from", "in", "inside", "into", "like", "near", "of", "off", "on", "onto", "out", "outside", "over", "past", "per", "plus", "regarding", "round", "since", "through", "throughout", "till", "to", "toward", "under", "underneath", "until", "up", "upon", "versus", "via", "with", "within", "without",
                    "being", "her", "themselves", "they", "shall", "around", "but", "because", "of", "over", "could", "he", "without", "yours", "through", "on", "himself", "or", "an", "at", "might", "we", "itself", "are", "herself", "when", "while", "onto", "be", "above", "in", "from", "yet", "along", "is", "it", "under", "may", "below", "by", "between", "myself", "throughout", "within", "although", "a", "been", "whose", "after", "that", "she", "i", "despite", "theirs", "unless", "before", "down", "except", "yourself", "outside", "behind", "would", "ours", "him", "will", "beneath", "ourselves", "his", "can", "against", "should", "inside", "whom", "nor", "and", "toward", "beside", "mine", "so", "off", "for", "you", "among", "with", "underneath", "until", "past", "upon", "into", "hers", "beyond", "me", "the", "like", "near", "during", "our", "out", "must", "my", "your", "were", "yourselves", "since", "their", "who", "them", "which", "us", "was", ",", ".", ":", ";", "'s", ""));

}
