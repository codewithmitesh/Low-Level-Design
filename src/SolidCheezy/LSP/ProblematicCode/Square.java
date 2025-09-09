
package SolidCheezy.LSP.ProblematicCode;

public class Square extends Rectangle {

    @Override
    public void setWidth(double width) {
        this.height = width;
        this.width = width;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }

}
