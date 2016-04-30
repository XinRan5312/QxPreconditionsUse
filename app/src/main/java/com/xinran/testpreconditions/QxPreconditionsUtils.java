package com.xinran.testpreconditions;
import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Created by qixinh on 16/4/30.
 */
public class QxPreconditionsUtils {
    public static void checkNotNull(Object obj,String errorMsg){
        Preconditions.checkNotNull(obj,errorMsg);
    }
    public static void checkArgument(boolean expresion,String errorMsg){
        Preconditions.checkArgument(expresion,errorMsg);
    }
    public static void checkState(List<Integer> intList,int index)throws Exception{
        //表达式为true不抛异常
        Preconditions.checkState(intList.size()<index, " intList size 不能大于"+index);
    }

    public static void checkPositionIndex(List<Integer> intList,int index) throws Exception{
        Preconditions.checkPositionIndex(index, intList.size(), "index "+index+" 不在 list中， List size为："+intList.size());
    }

    public static void checkPositionIndexes(List<Integer> intList,int start,int end) throws Exception{
        Preconditions.checkPositionIndexes(start, end, intList.size());
    }

    public static void checkElementIndex(List<Integer> intList,int index) throws Exception{
        Preconditions.checkElementIndex(index, intList.size(), "index 为 " + index + " 不在 list中， List size为： " + intList.size());
    }
}
