public class solution {
public static int[] findCenter(int[][] mat){
int[] center = new int[2];
int rowSize = mat.length;
int colSize = mat[0].length;
if (isEven(rowSize) && isEven(colSize)){
int row1 = rowSize/2 -1;
int row2 = rowSize/2;
int col1 = colSize/2 -1;
int col2 = colSize/2;
int topleft = mat[row1][col1];
int topright = mat[row1][col2];
int botleft = mat[row2][col1];
int botright = mat[row2][col2];
int max = topleft;
center[0] = row1;
center[1] = col1;
if (topright > max){
max = topright;
center[0] = row1;
center[1] = col2;
}
if(botleft > max){
max = botleft;
center[0] = row2;
center[1] = col1;
}
if(botright > max){
max = botright;
center[0] = row2;
center[1] = col2;
}
}
else if(isEven(rowSize) && !isEven(colSize)){
int col = colSize/2;
center[1] = col;
int row1 = rowSize/2 -1;
int row2 = rowSize/2;
if(mat[row1][col] > mat[row2][col]){
center[0] = row1;
}
else{
center[0] = row2;
}
}
else if(!isEven(rowSize) && isEven(colSize)){
int row = rowSize/2;
center[0] = row;
int col1 = colSize/2 -1;
int col2 = colSize/2;
if (mat[row][col1] > mat[row][col2]){
center[1] = col1;
}
else{
center[1] = col2;
}
}
// !isEven(rowSize) && !isEven(colSize)
else{
  center[0] = rowSize/2;
  center[1] = colSize/2;
}
return center;
}
public static boolean isEven(int n){
if (n % 2 == 0) {
  return true;
} else {
  return false;
}

}
