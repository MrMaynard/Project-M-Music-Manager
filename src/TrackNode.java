/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmm;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Eric
 */
public class TrackNode extends DefaultMutableTreeNode{
    public String nodeName;
    public String status = "Original";

    public TrackNode(String name) {
        nodeName = name;

    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        String color = status.equals("Custom") ? "Red" : "Green";
    //return color;        
    return "<html><b color='"+color+"'>"+
                nodeName +"~~~ "+status +"</b></html>";
    }
}
