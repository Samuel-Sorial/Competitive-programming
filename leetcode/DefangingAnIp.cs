public class DefangingAnIp {
    // Solution to https://leetcode.com/problems/defanging-an-ip-address/
    public string DefangIPaddr(string address) {
         StringBuilder addressBuilder = new StringBuilder();
            foreach(var c in address)
            {
                if(c != '.')
                {
                    addressBuilder.Append(c);
                }
                else
                {
                    addressBuilder.Append("[.]");
                }
            }

            return addressBuilder.ToString();
    }
}