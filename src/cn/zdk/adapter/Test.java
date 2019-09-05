package cn.zdk.adapter;

public class Test {

    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        TFCard tfCard = new TFCardImpl();
        SDadapter sDadapter = new SDadapter();
        sDadapter.setTfCard(tfCard);

        noteBook.read(sDadapter);
    }
}

