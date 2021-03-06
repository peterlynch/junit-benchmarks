package com.carrotsearch.junitbenchmarks;

/**
 * A result of a single test.
 */
class SingleResult
{
    public final long startTime;
    public final long afterGC;
    public final long endTime;

    public SingleResult(long startTime, long afterGC, long endTime)
    {
        this.startTime = startTime;
        this.afterGC = afterGC;
        this.endTime = endTime;
    }

    public long gcTime()
    {
        return afterGC - startTime;
    }

    public long evaluationTime()
    {
        return endTime - afterGC;
    }
}