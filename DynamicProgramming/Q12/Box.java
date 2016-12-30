public class Box{
  int height;
  int width;
  int depth;

  Box(int width,int height,int depth){
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  boolean canBeAbove(Box b){
    return (this.height > b.height && this.width > b.width && this.depth > b.depth);
  }
}
