public class MagicIndex{
  int magicIndex(int array[],int start,int end){
    if(end<start)
    return -1;
    int mid = (start + end)/2;
    if(array[mid] == mid)
    return mid;
    else if(array[mid] > mid)
    return magicIndex(array,start,mid - 1);
    else
    return magicIndex(array,mid + 1, end);
  }

int magicIndexNonDistinct(int array[],int start,int end){

int mid = (start + end)/2;
int midValue = array[mid];
if(midValue == mid)
return mid;
int leftIndex = Math.min(midValue , mid -1);

int left = magicIndexNonDistinct(array,start, leftIndex);

if(left>0)
return left;
int rightIndex = Math.max(midValue , mid + 1);

int right = magicIndexNonDistinct(array,rightIndex, end);
return right;

}

}
