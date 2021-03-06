/** Sorts equally spaced entries of an array into ascending order.
@param a an array of Comparable objects
@param first the integer index of the first array entry to
consider; first >= 0 and < a.length
@param last the integer index of the last array entry to
consider; last >= first and < a.length
@param space the difference between the indices of the
entries to sort */

private static < T extends Comparable < ? super T >>
void incrementalInsertionSort (T [] a, int first, int last, int space)
{
    int unsorted, index;
    for (unsorted = first + space ; unsorted <= last ;
            unsorted = unsorted + space)
    {
        T nextToInsert = a [unsorted];
        for (index = unsorted - space ; (index >= first) &&
                (nextToInsert.compareTo (a [index]) < 0) ;
                index = index - space)
        {
            a [index + space] = a [index];
        } // end for
        a [index + space] = nextToInsert;
    } // end for
} // end incrementalInsertionSort