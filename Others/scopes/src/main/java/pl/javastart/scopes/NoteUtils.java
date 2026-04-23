package pl.javastart.scopes;

class NoteUtils {
    static final String PRIVATE_PATH = "private";
    static final String PUBLIC_PATH = "public";

    public static String buildNoteUrl(Note note) {
        if (note.getType().equals(Note.TYPE_PRIVATE)) {
            return String.format("%s?id=%s", PRIVATE_PATH, note.getId());
        } else if (note.getType().equals(Note.TYPE_PUBLIC)) {
            return String.format("%s?id=%s", PUBLIC_PATH, note.getId());
        } else {
            throw new IllegalArgumentException("Unsupported note type: " + note.getType());
        }
    }
}
