package io.bisq.gui.components;

import javafx.scene.control.Labeled;
import javafx.scene.control.SkinBase;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Text;

public class TooltipUtil {

    public static void showTooltipIfTruncated(SkinBase skinBase, Labeled labeled) {
        for (Object node : skinBase.getChildren()) {
            if (node instanceof Text) {
                String displayedText = ((Text) node).getText();
                if (displayedText.equals(labeled.getText())) {
                    if (labeled.getTooltip() != null) {
                        labeled.setTooltip(null);
                    }
                } else if (labeled.getText() != null){
                    labeled.setTooltip(new Tooltip(labeled.getText());
                }
            }
        }
    }
}
