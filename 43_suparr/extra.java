// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW43 -- Array of Steel
// 2021-12-06
// time spent: X.XX hrs

/*
DISCOVERIES
    0.

UNRESOLVED QUESTIONS
    0.
*/

public class SuperArray {
    private int[] _arr;
    private int _size;

    public SuperArray() {
        this._arr = new int[10];
    }

    public int indexOf(int i) {
        return this._arr[i];
    }

    public void add(int i) {
        if (this._size == this._arr.length) {
            int[] newArr = new int[this._arr.length + 1];
            for (int idx = 0; idx < this._arr.length; idx++) {
                newArr[idx] = this._arr[idx];
            }
            this._arr = newArr;
        }

        this._arr[this._size] = i;
        _size++;
    }

    public String toString() {
        String arrString = "[";

        for (int ele : this._arr) {
            arrString = arrString + ele + ", ";
        }

        arrString = arrString.substring(0, arrString.length() - 2);
        arrString = arrString + "]";
        return arrString;
    }

    public static void main (String[] args) {
        SuperArray sa = new SuperArray(); System.out.println(sa);
        sa.add(1); System.out.println(sa);
        sa.add(2); System.out.println(sa);
        sa.add(3); System.out.println(sa);
        sa.add(4); System.out.println(sa);
        sa.add(5); System.out.println(sa);
        sa.add(6); System.out.println(sa);
        sa.add(7); System.out.println(sa);
        sa.add(8); System.out.println(sa);
        sa.add(9); System.out.println(sa);
        sa.add(10); System.out.println(sa);
        sa.add(11); System.out.println(sa);
    }
 }
