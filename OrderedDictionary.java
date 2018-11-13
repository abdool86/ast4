
public class OrderedDictionary implements OrderedDictionaryADT {
	public Record get (Record k) {}

    public void put (Record r) throws DictionaryException{}

    public void remove (Record k) throws DictionaryException{}

    public Record successor (Pair k) {}

    public Record predecessor (Pair k) {}

    public Record smallest () {}

    public Record largest () {}
}

