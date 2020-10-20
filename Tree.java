class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String bTreeName, String bTreeType, boolean bLeavesFall, String bLeafColor) {
    treeName = bTreeName;
    treeType = bTreeType;
    leavesFall = bLeavesFall;
    leafColor = bLeafColor;
  }

  void setTreeName(String bTreeName) {
    treeName = bTreeName;
  }

  void setTreeType(String bTreeType) {
    treeType = bTreeType;
  }

  void setLeafColor(String bLeafColor) {
    leafColor = bLeafColor;
  }

  String getTreeName() {
    return treeName;
  }

  String getTreeType() {
    return treeType;
  }

  boolean getLeafLoss() {
    return leavesFall;
  }
  String getLeafColor(){
    return leafColor;
  }

  void print() {
    if (leavesFall) {
      System.out.println("This is a " + treeName + "tree. It is a " + treeType + " and its leaves are currently "
          + leafColor + ". It does lose its leaves for the winter");
    } else {
      System.out.println("This is a " +    treeName + "tree. It is a " + treeType + "and its leaves are currently "
          + leafColor + ". It does not lose its leaves for the winter");
    }
  }
}