class Solution {
    public int[] sortArray(int[] nums)
    {
        mergeSort(nums, 0, nums.length);
        return nums;
    }

    public void merge(int[] arr, int l, int mid, int r)
    {
        int leftLength  = mid - l + 1;
        int rightLength = r - mid;

        int[] tmpLeft   = new int[leftLength];
        int[] tmpRight  = new int[rightLength];
        
        // Setup
        for (int i = 0; i < leftLength; i++)
        {
            tmpLeft[i] = arr[l + i];
        }

        for (int j = 0; j < rightLength; j++)
        {
            tmpRight[j] = arr[mid + 1 + j];
        }
        
        // Sorting
        int k = l, i = 0, j = 0;
        while (i < leftLength && j < rightLength)
        {
            if (tmpLeft[i] <= tmpRight[j])
            {
                arr[k] = tmpLeft[i];
                i++;
            }
            else
            {
                arr[k] = tmpRight[j];
                j++;
            }
            k++;
        }

        // Edge cases
        while (i < leftLength)
        {
            arr[k] = tmpLeft[i];
            i++;
            k++;
        }

        while (j < rightLength)
        {
            arr[k] = tmpRight[j];
            j++;
            k++;
        }

    }

    public void mergeSort(int[] arr, int l, int r)
    {
        if (l >= r)
        {
            return;
        }
        
        // Calculate the middle index
        int mid = l + (r - l) / 2;
        
        // Divide
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        
        // Conquer
        merge(arr, l, mid, r);

    }
}
