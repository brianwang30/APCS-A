Fred :: Brian Kang, Brian Wang, Ethan Lam
APCS pd6
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent: 1 hr


DISCO
------------------------------------------------
* The trees we are currently working on are only binary trees, meaning we can't extend to more than two options.
================================================


QCC
------------------------------------------------
* What is the difference between a Post Order Traversal and a In Order Traversal?
* What are some other possible routes that could be traversed and identified as a type of traversal?
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
  Trees grow downward because the root or the starting point is at the top and the leaves that are branched out altogether is the ending point.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
  1. The purpose of a tree is to map out different unique paths that an object can take to reach from a starting point to an ending point.
  2. The purpose of a tree is to traverse through different potential cycles that the object can follow through with from start to finish.
  3. The purpose of a tree is to sketch out closed and open tours. Open tours are when the branches continuously branch out to two more branches, while
  closed tours are unable to further move down the tree.
  4. The purpose of a tree is draw a diagram to "mentally" map out different routes or final outcomes.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
  A balanced tree is allowed a difference of 1 in height between the right and left subtrees because we can still identify or have to run through that tree level, so the time complexity remains the same.
  Not to mention, we would otherwise only be able to store 2^n elements in a tree if we couldn't partially fill the bottom layer, which would be inconvenient.
  However, it has to be 1 or else it's not balanced and is instead a monstrosity.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
  A balanced tree is a binary tree where the height (levels) of the left and right subtrees of any defined node would not be more than 1.

Is a perfect tree complete?
  A perfect tree is considered complete because a perfect tree is when the tree is full of nodes and children, and complete trees can have the exception of having the last level be entirely filled with children.

Is a complete tree balanced?
  A complete tree is considered balanced because the left and right subtrees differ by less than or equal to 1 in comparison to balanced trees, which in this case differs by 0 levels.

Is the Man Who Is Tall Happy?
   The Man who is tall isn't happy bcause he can't determine which possible route or option is the best to go after, is constantly overthinking.

What must be true of perfect trees but not others?
  Perfect trees are only perfect trees is the height of both the left and right subtree are exactly equal, there are no missing nodes or children and every cycle is identifiable.
================================================


C'EST POSSIBLE?
------------------------------------------------
< your explanation of whether the tree reconstruction challenge given in class is achievable or not >
================================================
Preorder: EGDKINLOW
Inorder: EKDNIOLWG
Status: POSSIBLE
The fact that the root (#1 in preorder) is also #1 in inorder tells us that the root only has 1 child, the right. This already heavily limits our options.
If we start with E as the root, we can get down:
:        E
:         \
:          G
:         /
:        D
:       /
:      K
We know that G is in the second position because it appears 2nd in preorder, and we have already established that there is only 1 child to the root E.
Continuing on after EGDK, the next two letters are IN in preorder. Since the order goes KDNI in inorder, we know that the K branch terminates, and I becomes the right child of D.
This puts N as the left child of I, as it appears NI in inorder.
:        E
:         \
:          G
:         /
:        D
:       / \
:      K   I
:         /
:        N
Now we have figured out EGDKIN, only left with LOW in preorder.
Likewise, in inorder, we only have OLWG to go through and backtrack.
The most notable thing about the left letters is that G appears at the end of inorder. This means that there are no right children to G.
Therefore, L must be the right child of I, as the other branches/leaves either already have 2 children or terminate.
:        E
:         \
:          G
:         /
:        D
:       / \
:      K   I
:         / \
:        N   L
We also know that the specific order in inorder is OLWG, and since we know that L is direct child of I, O and W must be L's left and right child respectively, as inorder has L between O and W, while the three are also subsequent in preorder.
:        E
:         \
:          G
:         /
:        D
:       / \
:      K   I
:         / \
:        N   L
:           / \
:          O   W
And like that, the tree is complete, and satisfies both conditions.
