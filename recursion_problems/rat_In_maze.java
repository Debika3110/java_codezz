package recursion_problems;/*
🐀 Problem Statement
You are given an n x n grid (maze).

1 → path is open, 0 → blocked.

The rat starts at (0, 0) (top-left corner) and needs to reach (n-1, n-1) (bottom-right corner).

The rat can only move Down (D) or Right (R).

Print all possible paths.
 */


import java.util.ArrayList;
import java.util.List;

public class rat_In_maze {
    public static void maze(int findPath[][],int n,int x,int y,String path,boolean[][] vis,List<String> result){
        if(x==n-1 && y==n-1){
            result.add(path);
            return;
        }
        vis[x][y]=true;
        int []row={1,0,-1,0};
        int []col={0,1,0,-1};
        char []dir={'D','R','U','L'};
        for(int i=0;i<4;i++){
            int r=x+row[i];
            int c=y+col[i];
            if(r>=0 && r<n && c>=0 && c<n && findPath[r][c]==1 && !vis[r][c]){
                maze(findPath,n,r,c,path+dir[i],vis,result);
            }
        }
        vis[x][y]=false;
    }

    public static void main(String[] args) {
        int[][] findPath = {
                {1, 0, 0},
                {1, 1, 0},
                {0, 1, 1}
        };
        int n=findPath.length;
        boolean [][] vis=new boolean[n][n];
        List<String> result=new ArrayList<>();
        if(findPath[0][0]==0 || findPath[n-1][n-1]==0){
            result.add(" ");
            return;
        }else{
            maze(findPath,n,0,0,"",vis,result);
        }
        System.out.println(result);
    }
}
