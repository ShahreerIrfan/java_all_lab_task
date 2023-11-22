import java.util.Scanner;
public class Task_five {
    // This is maximum funtion
    static int maxi(int n, int[] arr){
        int maximum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    // This is main function
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");

        n = input.nextInt();

        System.out.print("Enter "+n+" numbers: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Maximum number is:"+maxi(n, arr));
    }
}
#include<bits/stdc++.h>
using namespace std;
int coinChange(vector<int>& coins, int amount) {
    vector<int> dp(amount + 1, INT_MAX);
    dp[0] = 0;
    for (int coin : coins) {
        for (int i = coin; i <= amount; ++i) {
            if (dp[i - coin] != INT_MAX) {
                dp[i] = min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount] == INT_MAX ? -1 : dp[amount];
}

int main() {
    int n;
    cout<<"Enter the number of coins: ";
    cin>>n;
    vector<int> coins (n);
    cout<<"Enter "<<n<<" coin: ";
    for(int i=0;i<n;i++){
        cin>>coins[i];
    }
    
    int amount;
    cout<<"Enter the amount: ";
    cin>>amount;

    int result = coinChange(coins, amount);

    if (result != -1) {
        cout << "Minimum number of coins needed: " << result << endl;
    } else {
        cout << "It's not possible to make the amount with given coins." << endl;
    }
    return 0;
}
