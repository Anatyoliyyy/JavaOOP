package Lesson4.HomeWorke.Task2Messenger;

public class MessangerRunner {

    public static void main(String[] args) {
        Dialog dialog = new Dialog();

        Message m1 = new Message("Bob", new PlainText("Hello!"));
        dialog.addMessge(m1);

        Message m2 = new Message("Taras", new EmoticonText("smiling-face"));
        dialog.addMessge(m2);

        Message m3 = new Message("Bob", new PlainText("How are you?"));
        dialog.addMessge(m3);

        Message m4 = new Message("Taras", new PictureText("like"));
        dialog.addMessge(m4);

        System.out.println(dialog);
    }
}

//Dialog:
//
//Bob at 01:31:40 :
//Hello!
//
//Taras at 01:31:40 :
//😊
//
//Bob at 01:31:40 :
//How are you?
//
//Taras at 01:31:40 :
//________$$$$
//_______$$__$
//_______$___$$
//_______$___$$
//_______$$___$$
//________$____$$
//________$$____$$$
//_________$$_____$$
//_________$$______$$
//__________$_______$$
//____$$$$$$$________$$
//__$$$_______________$$$$$$
//_$$____$$$$____________$$$
//_$___$$$__$$$____________$$
//_$$________$$$____________$
//__$$____$$$$$$____________$
//__$$$$$$$____$$___________$
//__$$_______$$$$___________$
//___$$$$$$$$$__$$_________$$
//____$________$$$$_____$$$$
//____$$____$$$$$$____$$$$$$
//_____$$$$$$____$$__$$
//_______$_____$$$_$$$
//________$$$$$$$$$$
//
//
//
//
//Process finished with exit code 0